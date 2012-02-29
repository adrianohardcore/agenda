package controller;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import model.Dusr;
import model.common.EntityWrapper;
import repository.DusrRepository;
import rules.DusrRules;
import util.Encriptacao;
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
public class DusrController {

	private final DusrRepository repository;
	private final Result result;
	private final Validator validator;
	private final DusrRules dusrRules;
	

	public DusrController(Result result, DusrRepository repository, Validator validator, DusrRules dusrRules) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
		this.dusrRules = dusrRules;	
	}

	@Public
	@Get("/dusr/{dusr.id}/editar")
	public void editar(Dusr dusr) {
	  dusr = repository.loadById(dusr.getId());
	  result.include("dusr", dusr);
	}
	
	@Public
	@Get("/dusr/{dusr.id}")
	public void exibir(Dusr dusr) {
		dusr = repository.loadById(dusr.getId());		
		result.include("dusr", dusr);
	}		
	
	@Public
	@Get("/dusr")
	public void listagem() {

	}
	
	@Public
	@Get("/dusr/gridy")
	public void listByFilter(String search, int page, String sortName, String sortOrder, String find, int rows) {
		Collection<Dusr> dusrList = repository.listByFilter(search, page, sortName, sortOrder, find, rows);
		int total = repository.countByFilter(search, find);
		EntityWrapper<Dusr> wrapper = new EntityWrapper<Dusr>();
		wrapper.setEntityList(dusrList);
		wrapper.setTotal(total);
		result.use(Results.json()).withoutRoot().from(wrapper)
		.include("entityList")
		.serialize();
	}

	@Public
	@Get("/dusr/novo")
	public void novo() {
		Dusr dusr = new Dusr();
		dusr = dusrRules.novo();
		result.include("dusr", dusr);		
	}
	
	@Public
	@Delete("/dusr/{dusr.id}")
	public void remover(Dusr dusr) {
	  repository.remove(dusr.getId());

	  result
	  .include("message", "Contato removido com sucesso!")
	  .redirectTo(this).listagem();
	}
	
	@Public
	@Post("/dusr")
	public void salvar(final Dusr dusr) {		
		dusrRules.atualizacao(dusr);		
		String senha = new Encriptacao().Encriptar(dusr.getDusrsenha());
		dusr.setDusrsenha(senha);
		
		
		
		validator.validate(dusr);
		validator.checking(new Validations(){{			
			//that(dusr.getAgdnome().isEmpty() == false,"erro", "O Nome n�o pode ser vazio");
			that(dusr.getId()!= null ,"erro","Favor informar usu�rio");
		}});		
		validator.onErrorUsePageOf(this).novo();
		
		try {
			repository.save(dusr);			
			result
			.include("message", "Contato c�digo "+ dusr.getId() + " salvo com sucesso!!!" )
			.redirectTo(this).listagem();
			
		} catch (Exception e) {
			System.err.println("Erro");
		}			
	}
	
	@Public
	@Get("/negado")
	public void negado() {
		
	}
}
