package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Collection;

import model.Dusr;
import model.common.EntityWrapper;
import model.common.UsuarioStatus;
import repository.DusrRepository;
import util.Encriptacao;
import util.UploadFoto;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.interceptor.download.Download;
import br.com.caelum.vraptor.interceptor.download.FileDownload;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.com.caelum.vraptor.validator.Validations;
import br.com.caelum.vraptor.view.Results;

import component.UserSession;

@Resource
public class DusrController {

	private final DusrRepository repository;
	private final Result result;
	private final Validator validator;	
	private final UserSession userSession;
	private final UploadFoto uploadFoto;

	public DusrController(Result result, DusrRepository repository, Validator validator, UserSession userSession ,UploadFoto uploadFoto) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;		             
		this.userSession = userSession;
		this.uploadFoto = uploadFoto;	
	}                    


	@Get("/dusr/{dusr.id}/editar")
	public void editar(Dusr dusr) {
		dusr = repository.loadById(dusr.getId());
		result.include("UsuarioStatus", UsuarioStatus.values());
		result.include("dusr", dusr);					
	}


	@Get("/dusr/{dusr.id}")
	public void exibir(Dusr dusr) {
		dusr = repository.loadById(dusr.getId());		
		result.include("dusr", dusr);
	}		


	@Get("/dusr/existe/{dusr.id}")  
    public void existe(Dusr dusr) {  
		dusr = repository.loadById(dusr.getId());   
        if (dusr != null){  
            System.out.println("Usuário encontrado");                 
            result.include("dusr", dusr);  
        }else{  
            System.out.println("Usuário não encontrado");     
            result.notFound();  
        }     
    }  
	
	
	


	@Get("/dusr")
	public void listagem() {
	}	



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


	@Get("/dusr/novo")
	public UsuarioStatus[] novo() {
		return UsuarioStatus.values();
	}



	//
	@Delete("/dusr/{dusr.id}")
	public void remover(Dusr dusr) {
		repository.remove(dusr.getId());
		result
		.include("message", "Contato removido com sucesso!")
		.redirectTo(this).listagem();
	}

	//
	@Post("/dusr")
	public void salvar(final Dusr dusr) throws Exception {		
		String senha = new Encriptacao().Encriptar(dusr.getDusrsenha());
		dusr.setDusrsenha(senha);		
		validator.validate(dusr);
		validator.checking(new Validations(){{
			that(dusr.getId()!= null ,"erro","Favor informar usuário");
		}});		
		validator.onErrorUsePageOf(this).novo();

		try {
			repository.save(dusr);			
			result
			.include("message", "Contato código "+ dusr.getId() + " salvo com sucesso!!!" )
			.redirectTo(this).listagem();

		} catch (Exception e) {
			System.err.println("Erro");
		}			
	}



	@Post("/dusr/atualiza")
	public void atualiza(final Dusr dusr ,UploadedFile foto)  {
		Dusr dusrDb = new Dusr();
		dusrDb = repository.loadById(dusr.getId());		
		if (foto != null){
			dusr.setDusrFotoB(uploadFoto.converter(foto));
			dusr.setDusrFotoBext(uploadFoto.extensao(foto));
		}else {
			dusr.setDusrFotoB(dusrDb.getDusrFotoB());			
		}

		try {
			dusr.setDusrusr(userSession.getUser().getId().shortValue());

		} catch (Exception e) {
			dusr.setDusrusr((short) 0);
			System.out.println("Nenhum usuário logado");			
		}

		validator.validate(dusr);
		validator.checking(new Validations(){{			
			that(dusr.getId()!= null ,"erro","Favor informar usuário");
		}});		
		validator.onErrorUsePageOf(this).editar(dusr);

		try {
			repository.save(dusr);			
			result
			.include("message", "Contato código "+ dusr.getId() + " salvo com sucesso!!!" )
			.redirectTo(this).editar(dusr);

		} catch (Exception e) {
			System.err.println("Erro");
		}			
	}   


	@Get("/dusr/{dusr.id}/imagem")
	public Download downloadImage(Dusr dusr) {
		dusr = repository.loadById(dusr.getId());
		String nomeArq = ("dusr-" + dusr.getId() + "-Foto." + dusr.getDusrFotoBext());		
		byte[] foto = dusr.getDusrFotoB();			
		try {				
			//convert array of bytes into file
			FileOutputStream fileOuputStream = new FileOutputStream("e:\\imagens\\" + nomeArq); 
			fileOuputStream.write(foto);
			fileOuputStream.close();
			System.out.println("Done");
		}catch(Exception e){
			e.printStackTrace();
		}
		File file = new File("e:\\imagens\\" + nomeArq);	
		if (!file.exists()) {
			return new FileDownload(new File("e:\\teste.jpg", "default.jpg"), "image/jpg", "default.jpg");
		}
		String fileName = dusr.getDusrnome().replaceAll(" ", "-") + ".jpg";
		return new FileDownload(file, "image/jpg", fileName);
	}	
}