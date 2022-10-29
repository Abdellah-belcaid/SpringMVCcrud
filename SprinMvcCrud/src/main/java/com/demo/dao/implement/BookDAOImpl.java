package com.demo.dao.implement;

import java.util.List;

import javax.transaction.Transactional;

import com.demo.dao.layer.BookDAO;
import com.demo.models.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class BookDAOImpl implements BookDAO {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public void addBook(Book book) {
		hibernateTemplate.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return hibernateTemplate.loadAll(Book.class);
	}

	@Override
	public Book getBookById(int id) {

		return hibernateTemplate.get(Book.class, id);
	}

	@Transactional
	@Override
	public void updateBook(Book book) {
		hibernateTemplate.update(book);

	}

	@Transactional
	@Override
	public void deleteBook(int id) {
		hibernateTemplate.delete(hibernateTemplate.load(Book.class, id));

	}

}
