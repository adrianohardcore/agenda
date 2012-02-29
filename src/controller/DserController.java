package controller;

import java.util.Collection;
import java.util.Date;

import model.Dser;
import model.common.EntityWrapper;
import repository.DserRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import br.com.caelum.vraptor.view.Results;

@Resource
public class DserController {

	private final DserRepository repository;
	private final Result result;
	private final Validator validator;	

	public DserController(Result result, DserRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;	
	}
	
	@Get("/dser/{dser.id.dserest}/{dser.id.dserpar}/editar")
	public void editar(Dser dser) {

			
		
		
	  dser = repository.loadById(dser.getId());
	  result.include("dser", dser).forwardTo(this).novo();
	}
	
	@Get("/dser/{dser.id.dserest}/{dser.id.dserpar}")
	public void exibir(Dser dser) {
		dser = repository.loadById(dser.getId());
		result.include("dser", dser);
	}	

	@Get("/dser")
	public void listagem() {

	}

	@Get("/dser/gridy")
	public void listByFilter(String search, int page, String sortName, String sortOrder, String find, int rows) {
		Collection<Dser> dserList = repository.listByFilter(search, page, sortName, sortOrder, find, rows);

		int total = repository.countByFilter(search, find);

		EntityWrapper<Dser> wrapper = new EntityWrapper<Dser>();
		wrapper.setEntityList(dserList);
		wrapper.setTotal(total);

		result.use(Results.json()).withoutRoot().from(wrapper)
		.include("entityList")
		.serialize();
	}

	
	@Get("/dser/novo")
	public void novo() {	  
		 
	}
	
	@Delete("/dser/{dser.id.dserest}/{dser.id.dserpar}")
	public void remover(Dser dser) {
	  repository.remove(dser.getId());
	  result
	  .include("message", "Serialização removido com sucesso!")
	  .redirectTo(this).listagem();
	}

	

	@Post("/dser")
	public void salvar(final Dser dser) {		
		dser.setDserdtalt(new Date());		
		validator.validate(dser);
		validator.checking(new Validations(){{			
			//that(dser.getAgdnome().isEmpty() == false,"erro", "O Nome não pode ser vazio");			
		}});		
		validator.onErrorUsePageOf(this).novo();
		repository.save(dser);
		result
		.include("message", "Serialização salva com sucesso!!!" )
		.redirectTo(this).listagem();	
	}
}