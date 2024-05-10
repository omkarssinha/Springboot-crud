package com.proj.springbootcrudapi.service;

import java.io.IOException;
import java.util.List;

import com.proj.springbootcrudapi.model.Book;

public interface BookService {
	
	List<Book> get();
	Book get(String isbn);
	boolean save(Book book) throws IOException;
	void delete(String isbn);

}
