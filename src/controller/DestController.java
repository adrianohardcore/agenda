package controller;

import java.util.Collection;

import model.Dest;
import model.common.EntityWrapper;
import repository.DestRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import br.com.caelum.vraptor.view.Results;

@Resource
public class DestController {

	private final DestRepository repository;
	private final Result result;
	private final Validator validator;
	

	public DestController(Result result, DestRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;	
	}


	@Get("/dest/{dest.id}/editar")
	public void editar(Dest dest) {
	  dest = repository.loadById(dest.getId());
	  result.include("dest", dest).forwardTo(this).novo();
	}

	@Get("/dest/{dest.id}")
	public void exibir(Dest dest) {
		dest = repository.loadById(dest.getId());		
		result.include("dest", dest);
	}	

	@Get("/dest")
	public void listagem() {

	}

	@Get("/dest/gridy")
	public void listByFilter(String search, int page, String sortName, String sortOrder, String find, int rows) {
		Collection<Dest> destList = repository.listByFilter(search, page, sortName, sortOrder, find, rows);
		int total = repository.countByFilter(search, find);
		EntityWrapper<Dest> wrapper = new EntityWrapper<Dest>();
		wrapper.setEntityList(destList);
		wrapper.setTotal(total);
		result.use(Results.json()).withoutRoot().from(wrapper)
		.include("entityList")
		.serialize();
	}

	@Get("/dest/novo")
	public void novo() {

	}

	@Delete("/dest/{dest.id}")
	public void remover(Dest dest) {
	  repository.remove(dest.getId());

	  result
	  .include("message", "Contato removido com sucesso!")
	  .redirectTo(this).listagem();
	}
	
	@Post("/dest")
	public void salvar(final Dest dest) {			
		validator.validate(dest);
		validator.checking(new Validations(){{			
			//that(dest.getAgdnome().isEmpty() == false,"erro", "O Nome não pode ser vazio");			
		}});		
		validator.onErrorUsePageOf(this).novo();
		repository.save(dest);				
		result
		.include("message", "Contato código "+ dest.getId() + " salvo com sucesso!!!" )
		.redirectTo(this).listagem();	
	}
}
