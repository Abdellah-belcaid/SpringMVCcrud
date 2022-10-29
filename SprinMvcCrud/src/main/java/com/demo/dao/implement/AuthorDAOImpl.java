package com.demo.dao.implement;

import java.util.List;

import javax.transaction.Transactional;

import com.demo.dao.layer.AuthorDAO;
import com.demo.models.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class AuthorDAOImpl implements AuthorDAO {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public void addAuthor(Author Author) {
		hibernateTemplate.save(Author);
	}

	@Override
	public List<Author> getAllAuthors() {
		return hibernateTemplate.loadAll(Author.class);
	}

	@Override
	public Author getAuthorById(int id) {

		return hibernateTemplate.get(Author.class, id);
	}

	@Transactional
	@Override
	public void updateAuthor(Author Author) {
		hibernateTemplate.update(Author);

	}

	@Transactional
	@Override
	public void deleteAuthor(int id) {
		hibernateTemplate.delete(hibernateTemplate.load(Author.class, id));

	}

}
