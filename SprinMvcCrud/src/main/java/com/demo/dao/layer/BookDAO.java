package com.demo.dao.layer;

import java.util.List;

import com.demo.models.Book;

public interface BookDAO {

	void addBook(Book book);

	List<Book> getAllBooks();

	Book getBookById(int id);

	void updateBook(Book book);

	void deleteBook(int id);

}
