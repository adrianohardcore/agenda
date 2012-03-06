package controller;

import java.util.Collection;

import model.Agenda;
import model.common.EntityWrapper;
import repository.AgendaRepository;
import annotation.Public;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import br.com.caelum.vraptor.view.Results;

@Resource
public class AgendaController {

	private final AgendaRepository repository;
	private final Result result;
	private final Validator validator;
	

	public AgendaController(Result result, AgendaRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;	
	}

	@Public
	@Get("/agenda/{agenda.id}/editar")
	public void editar(Agenda agenda) {
	  agenda = repository.loadById(agenda.getId());
	  result.include("agenda", agenda).forwardTo(this).novo();
	  
	  
	}

	@Public
	@Get("/agenda/{agenda.id}")
	public void exibir(Agenda agenda) {
		agenda = repository.loadById(agenda.getId());		
		result.include("agenda", agenda);
	}	

	@Public
	@Get("/agenda")
	public void listagem() {

	}

	@Public
	@Get("/agenda/gridy")
	public void listByFilter(String search, int page, String sortName, String sortOrder, String find, int rows) {
		Collection<Agenda> agendaList = repository.listByFilter(search, page, sortName, sortOrder, find, rows);
		int total = repository.countByFilter(search, find);
		EntityWrapper<Agenda> wrapper = new EntityWrapper<Agenda>();
		wrapper.setEntityList(agendaList);
		wrapper.setTotal(total);
		result.use(Results.json()).withoutRoot().from(wrapper)
		.include("entityList")
		.serialize();
	}

	@Public
	@Get("/agenda/novo")
	public void novo() {

	}
	
	@Public
	@Delete("/agenda/{agenda.id}")
	public void remover(Agenda agenda) {
	  repository.remove(agenda.getId());

	  result
	  .include("message", "Contato removido com sucesso!")
	  .redirectTo(this).listagem();
	}
	
	@Public
	@Post("/agenda")
	public void salvar(final Agenda agenda) throws Exception {
		Integer num = 0 ;
		if (agenda.getId() == null){
			num = repository.CarregaNumCod(); 
			System.out.println("####################################Atenção");
			System.out.println(num);
			
			agenda.setId((int) num);			
		}		
		validator.validate(agenda);
		validator.checking(new Validations(){{			
			that(agenda.getAgdnome().isEmpty() == false,"erro", "O Nome n�o pode ser vazio");			
		}});		
		validator.onErrorUsePageOf(this).novo();
		repository.save(agenda);
		if (num > 0){
			repository.saveCod(num);	
		}		
		result
		.include("message", "Contato c�digo "+ agenda.getId() + " salvo com sucesso!!!" )
		.redirectTo(this).listagem();	
	}
}
