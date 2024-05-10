package com.proj.springbootcrudapi.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.springbootcrudapi.model.Book;
import com.proj.springbootcrudapi.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/book")
	public List<Book> get(){
		
		return bookService.get();
		
	}
	@PostMapping("/book")
	public Book save(@RequestBody Book bookObj) throws IOException {
		
		if(bookService.save(bookObj))
			throw new RuntimeException("book does not exist with isbn : "+bookObj.getIsbn());
		return bookObj;
		
	}
	@GetMapping("/book/{isbn}")
	public Book get(@PathVariable int isbn){
		
		Book bookObj = bookService.get(isbn);
		if(bookObj==null)
			throw new RuntimeException("Book does not exist with isbn : "+isbn);
		
		return bookObj;
		
	}
	
	@PutMapping("/book")
	public Book update(@RequestBody Book bookObj) throws IOException{
		
		try {
			if(bookService.save(bookObj))
				return bookObj;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bookObj;
	
	}
	
	@DeleteMapping("/book/{isbn}")
	public String delete(@PathVariable int isbn){
		
		bookService.delete(isbn);
		return "Book has been deleted with isbn : "+isbn;
	
	
	}

}
