package com.proj.springbootcrudapi.dao;

import java.util.List;

import com.proj.springbootcrudapi.model.Book;

public interface BookDao {
	
	List<Book> get();
	Book get(String id);
	void save(Book book);
	void delete(String id);

}
