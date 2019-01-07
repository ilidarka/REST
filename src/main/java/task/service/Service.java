package task.service;

import java.util.List;

import task.entity.AbstractEntity;

public interface Service<T extends AbstractEntity> {

	T read(Long id);

	List<T> read();

	void save(T entity);

	void delete(Long id);

}
