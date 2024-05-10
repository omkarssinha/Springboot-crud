package com.proj.springbootcrudapi.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.springbootcrudapi.dao.BookDao;
import com.proj.springbootcrudapi.model.Book;

import jakarta.transaction.Transactional;

@Service
public class BookServiceImpl implements BookService{
	
	private final String API_KEY = "AIzaSyA2Z_lKh-gCVHZi5dpBW9yj3DFy62bFQB0";

	@Autowired
	private BookDao bookDao;
	
	@Transactional
	@Override
	public List<Book> get() {

		return bookDao.get();
	}

	@Transactional
	@Override
	public Book get(int isbn) {

		return bookDao.get(isbn);
	}

	@Transactional
	@Override
	public boolean save(Book book) throws IOException {
		
		if(doesBookExist(String.valueOf(book.getIsbn()))) {
			bookDao.save(book);
			return true;
		}
		else
			return false;
		
	}

	@Transactional
	@Override
	public void delete(int isbn) {

		bookDao.delete(isbn);
		
	}

    public boolean doesBookExist(String bookId) throws IOException {
        String urlString = "https://www.googleapis.com/books/v1/volumes/" + bookId + "?key=" + API_KEY;
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            Scanner scanner = new Scanner(connection.getInputStream());
            StringBuilder response = new StringBuilder();
            while (scanner.hasNextLine()) {
                response.append(scanner.nextLine());
            }
            scanner.close();

            // Check if the response contains information about the book
            return response.toString().contains("\"totalItems\":1");
        } else {
            System.out.println("Error: Unable to connect to Google Books API "+responseCode);
            return false;
        }
    }
	
	
}
