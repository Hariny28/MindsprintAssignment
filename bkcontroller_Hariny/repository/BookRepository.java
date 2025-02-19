package com.onlycodes.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlycodes.app.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	List<Book> findByYear(int year);
}
