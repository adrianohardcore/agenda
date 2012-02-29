package component;

import model.Dusr;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@Component
@SessionScoped
public class UserSession {

	private Dusr user;

	public boolean isLogged() {
		return user != null;
	}

	public void logout() {
		user = null;
	}

	public Dusr getUser() {
		return user;
	}

	public void setUser(Dusr user) {
		this.user = user;
	}

}