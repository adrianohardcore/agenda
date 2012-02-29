package controller;

import model.Dusr;
import repository.LoginRepository;
import util.Encriptacao;
import annotation.Public;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import component.UserSession;

@Resource
public class LoginController {

	private Result result;
	private UserSession userSession;
	private LoginRepository repository;

	public LoginController(Result result, UserSession userSession, LoginRepository repository) {
		this.result = result;
		this.userSession = userSession;
		this.repository = repository;
	}

	@Public
	@Get("/login")
	public void login() {

	}

	@Public
	@Post("/autenticar")
	public void autenticar(Dusr dusr) {		
		String senha = new Encriptacao().Encriptar(dusr.getDusrsenha());		
		Dusr user = repository.autenticar(dusr.getId(),senha);
		if (user != null) {
			userSession.setUser(user);
			result.redirectTo(IndexController.class).index();
		} else {
			result.include("error", "Usuário ou senha incorreta!").redirectTo(this).login();		
		}
	}
 
	@Get("/logout")
	public void logout() {
		userSession.logout();
		result.redirectTo(this).login();
	}

}
