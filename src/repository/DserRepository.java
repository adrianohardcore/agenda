package repository;

import java.util.Collection;

import model.Dser;
import repository.common.GenericRepository;



public interface DserRepository extends GenericRepository<Dser> {

	Integer countByFilter(String search, String find);

	Collection<Dser> listByFilter(String search, int page, String sortName, String sortOrder, String find, int rows);
	
	public Integer getSerial(Integer dserEst, String dserPar);

}