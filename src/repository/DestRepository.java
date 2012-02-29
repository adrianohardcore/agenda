package repository;

import java.util.Collection;

import model.Dest;
import repository.common.GenericRepository;

public interface DestRepository extends GenericRepository<Dest> {
	Integer countByFilter(String search, String find);
	Collection<Dest> listByFilter(String search, int page, String sortName, String sortOrder, String find, int rows);	
}