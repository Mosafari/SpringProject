package repository;

import java.util.List;

public interface CrudInterface<T> {
	List<T> findAll();
}
