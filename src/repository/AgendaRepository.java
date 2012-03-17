package repository;

import java.util.Collection;

import model.Agenda;
import repository.common.GenericRepository;

public interface AgendaRepository extends GenericRepository<Agenda> {

	Integer countByFilter(String search, String find);

	Collection<Agenda> listByFilter(String search, int page, String sortName, String sortOrder, String find, int rows);
	
	public int CarregaNumCod();
	
	public void saveCod(Integer id);

}