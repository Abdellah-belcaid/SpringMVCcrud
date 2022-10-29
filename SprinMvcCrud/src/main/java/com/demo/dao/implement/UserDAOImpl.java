package com.demo.dao.implement;

import java.util.List;

import javax.transaction.Transactional;

import com.demo.dao.layer.UserDAO;
import com.demo.models.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class UserDAOImpl implements UserDAO {
	@Autowired
	HibernateTemplate hibernateTemplate;

	
	@Override
	public void addUser(Users User) {
		hibernateTemplate.save(User);
	}

	@Override
	public List<Users> getAllUsers() {
		return hibernateTemplate.loadAll(Users.class);
	}

	@Override
	public Users getUserById(int id) {

		return hibernateTemplate.get(Users.class, id);
	}

	
	@Override
	public void updateUser(Users User) {
		hibernateTemplate.update(User);

	}

	
	@Override
	public void deleteUser(int id) {
		hibernateTemplate.delete(hibernateTemplate.load(Users.class, id));

	}

}
