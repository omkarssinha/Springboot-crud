package com.proj.springbootcrudapi.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proj.springbootcrudapi.model.Book;

import jakarta.persistence.EntityManager;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Book> get() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Book> query = currentSession.createQuery("from Book", Book.class);
		List<Book> list = query.getResultList();
		return list;
	}

	@Override
	public Book get(String id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		Book bookObj = currentSession.get(Book.class, id);
		return bookObj;
	}

	@Override 
	public void save(Book book) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(book);
	}

	@Override
	public void delete(String id) {

		Session currentSession = entityManager.unwrap(Session.class);
		Book bookObj = currentSession.get(Book.class, id);
		currentSession.delete(bookObj);
	}
	
	


}
