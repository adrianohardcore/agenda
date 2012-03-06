package business;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import model.Dser;
import model.DserPK;
import repository.DserRepository;
import br.com.caelum.vraptor.ioc.Component;
import business.common.GenericBusiness;

@Component
public class DserBusiness extends GenericBusiness<Dser> implements DserRepository {

	public DserBusiness(EntityManager manager) {
		super(manager);
	}

	public Integer countByFilter(String search, String find) {

		Query query = manager.createQuery("select count(e.id.dserest) from Dser e where e." + find + " like :search");
		query.setParameter("search", "%" + search + "%");

		return ((Long) query.getSingleResult()).intValue();
	}

	public Collection<Dser> listByFilter(String search, int page, String sortName, String sortOrder, String find, int rows) {
		String sql = "from Dser e where e." + find + " like :search";
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
		Collection<Dser> resultList = query.getResultList();

		return resultList;
	}	

	public Integer getSerial(Integer dserEst, String dserPar) throws Exception{
		try {
			Query query = manager.createQuery("select e.dserserial from Dser e where e.id.dserest = :dserEst and e.id.dserpar = :dserPar");
			query.setParameter("dserEst", dserEst);
			query.setParameter("dserPar", dserPar);				
			Long num = (Long) query.getSingleResult();				
			return num.intValue(); 		
		}catch (NoResultException e) {
			Dser dser = new Dser();
			DserPK dserPK = new DserPK();
			dserPK.setDserest(dserEst);
			dserPK.setDserpar(dserPar);			
			dser.setDserserial((long) 1);
			dser.setId(dserPK);
			manager.merge(dser);
			return 0;			
		} catch (Exception e) {
			throw new Exception("Erro geral!");			
		}		
	}	
}