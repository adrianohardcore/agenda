package business;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Agenda;
import model.Dser;
import model.DserPK;
import repository.AgendaRepository;
import repository.DserRepository;
import br.com.caelum.vraptor.ioc.Component;
import business.common.GenericBusiness;

@Component
public class AgendaBusiness extends GenericBusiness<Agenda> implements AgendaRepository {

	private final DserRepository dserRepository;


	public AgendaBusiness(EntityManager manager , DserRepository dserRepository) {
		super(manager);
		this.dserRepository = dserRepository;
	}

	public Integer countByFilter(String search, String find) {
		Query query = manager.createQuery("select count(e.id) from Agenda e where e." + find + " like :search");
		query.setParameter("search", "%" + search + "%");

		return ((Long) query.getSingleResult()).intValue();
	}

	public Collection<Agenda> listByFilter(String search, int page, String sortName, String sortOrder, String find, int rows) {
		String sql = "from Agenda e where e." + find + " like :search";
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
		Collection<Agenda> resultList = query.getResultList();

		return resultList;
	}	
	
	public int CarregaNumCod() {
		Agenda agenda ;
		Integer serial,id = 0;				
		serial = dserRepository.getSerial(0, "AGD");
		while (id == 0) { 
			serial ++;
			try {				
				agenda = manager.find(Agenda.class, serial);				
				agenda.getId();		
			}			
			catch (Exception e) {
				id = 1 ;				
			}				
		}			
		return serial;
	}		

	public void saveCod(Integer id) {		
		Dser dser = new Dser();
		DserPK dserPk = new DserPK();
		dserPk.setDserest(0);
		dserPk.setDserpar("AGD");
		dser.setId(dserPk);		
		dser = dserRepository.loadById(dser.getId());
		dser.setDserserial(id.longValue());
		dserRepository.save(dser);		
	}	
}