package controller;

import java.util.Collection;
import java.util.Date;

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

import component.UserSession;

@Resource
public class AgendaController {

	private final AgendaRepository repository;
	private final Result result;
	private final Validator validator;
	private final UserSession userSession;
	

	public AgendaController(Result result, AgendaRepository repository, Validator validator ,UserSession userSession) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
		this.userSession = userSession;	
	}


	@Get("/agenda/{agenda.id}/editar")
	public void editar(Agenda agenda) {
	  agenda = repository.loadById(agenda.getId());
	  result.include("agenda", agenda).forwardTo(this).novo();	  
	}

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

	@Get("/agenda/novo")
	public void novo() {
	}

	@Delete("/agenda/{agenda.id}")
	public void remover(Agenda agenda) {
	  repository.remove(agenda.getId());
	  result
	  .include("message", "Contato removido com sucesso!")
	  .redirectTo(this).listagem();
	}
	
	@Post("/agenda")
	public void salvar(final Agenda agenda) {		
		Integer num = 0 ;
		agenda.setAgddtalt(new Date());
		agenda.setAgdusr(userSession.getUser().getId().shortValue());		
		if (agenda.getId() == null){
			num = repository.CarregaNumCod();  
			agenda.setId((int) num);			
		}		
		validator.validate(agenda);
		validator.checking(new Validations(){{			
			that(agenda.getAgdnome().isEmpty() == false,"erro", "O Nome não pode ser vazio");			
		}});		
		validator.onErrorUsePageOf(this).novo();
		repository.save(agenda);
		if (num > 0){
			repository.saveCod(num);	  
		}		
		result
		.include("message", "Contato código "+ agenda.getId() + " salvo com sucesso!!!" )
		.redirectTo(this).listagem();	
	}
}
