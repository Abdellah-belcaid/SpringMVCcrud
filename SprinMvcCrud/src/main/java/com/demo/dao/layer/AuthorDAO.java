package com.demo.dao.layer;

import java.util.List;

import com.demo.models.Author;

public interface AuthorDAO {

	void addAuthor(Author Author);

	List<Author> getAllAuthors();

	Author getAuthorById(int id);

	void updateAuthor(Author Author);

	void deleteAuthor(int id);

}
