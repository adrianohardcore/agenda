package repository.common;

import java.util.Collection;

import model.common.AbstractEntity;


public interface GenericRepository <T extends AbstractEntity> {

	Collection<T> loadAll();

	T loadById(Object id);

	void remove(Object id);

	T save(T entity);

}