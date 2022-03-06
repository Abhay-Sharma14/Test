package com.users.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.users.model.Book;


@RepositoryRestResource(collectionResourceRel = "/bookSave")
public interface BookRepository extends JpaRepository<Book, Long>{

	public List<Book> findBybookName(String name);

	//public List<Book> findBybookId(Long id);
	

}
