package business;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import repository.LoginRepository;

import model.Dusr;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class LoginBusiness implements LoginRepository{

	private EntityManager manager;

	public LoginBusiness(EntityManager manager) {
		this.manager = manager;
	}

	public Dusr autenticar(Integer usuario, String senha) {
		try {
			Query query = manager.createQuery("from Dusr where id = :usuario and dusrsenha = :senha");
			query.setParameter("usuario", usuario);
			query.setParameter("senha", senha);
			return (Dusr) query.getSingleResult();
		} catch (NoResultException e) {			
			return null;
		}
	}

}