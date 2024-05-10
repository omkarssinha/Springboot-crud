package com.proj.springbootcrudapi.model;

///import javax.persistance.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@Column
	private String isbn;
	@Column
	private String title;
	@Column
	private String year_of_publication;
	@Column
	private String author;
	
	@Override
	public String toString() {
		return "book [ISBN=" + isbn + ", Title=" + title + ", Year_of_publication=" + year_of_publication + ", Author=" + author + "]";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear_of_publication() {
		return year_of_publication;
	}

	public void setYear_of_publication(String year_of_publication) {
		this.year_of_publication = year_of_publication;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
