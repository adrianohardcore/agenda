package business;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Dusr;
import repository.DusrRepository;
import br.com.caelum.vraptor.ioc.Component;
import business.common.GenericBusiness;

@Component
public class DusrBusiness extends GenericBusiness<Dusr> implements DusrRepository {

	public DusrBusiness(EntityManager manager) {
		super(manager);	
	}

	public Integer countByFilter(String search, String find) {
		Query query = manager.createQuery("select count(e.id) from Dusr e where e." + find + " like :search");
		query.setParameter("search", "%" + search + "%");

		return ((Long) query.getSingleResult()).intValue();
	}

	public Collection<Dusr> listByFilter(String search, int page, String sortName, String sortOrder, String find, int rows) {
		String sql = "from Dusr e where e." + find + " like :search";
		String order = " order by e." + find;

		if (sortName != null && !sortName.isEmpty()) {
			order = " order by e." + sortName;
		}

		if (sortOrder != null && !sortOrder.isEmpty()) {
			order += " " + sortOrder;
		}

		int inicio = (page - 1) * rows;

		Query query = manager.createQuery(sql + order);
		query.setFirstResult(inicio);
		query.setMaxResults(rows);

		query.setParameter("search", "%" + search + "%");

		@SuppressWarnings("unchecked")
		Collection<Dusr> resultList = query.getResultList();

		return resultList;
	}	
}