package repository;

import java.util.Collection;

import model.Dusr;
import repository.common.GenericRepository;

public interface DusrRepository extends GenericRepository<Dusr> {
	Integer countByFilter(String search, String find);
	Collection<Dusr> listByFilter(String search, int page, String sortName, String sortOrder, String find, int rows);
}