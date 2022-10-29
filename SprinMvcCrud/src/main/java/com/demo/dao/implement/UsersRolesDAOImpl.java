package com.demo.dao.implement;

import java.util.List;

import javax.transaction.Transactional;

import com.demo.dao.layer.UsersRolesDAO;
import com.demo.models.UsersRoles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class UsersRolesDAOImpl implements UsersRolesDAO {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public void addUserRoles(UsersRoles Role) {
		hibernateTemplate.save(Role);

	}

	@Override
	public List<UsersRoles> getAllUsersRoles() {
		return hibernateTemplate.loadAll(UsersRoles.class);
	}

	@Override
	public UsersRoles getUserRoleById(int id) {

		return hibernateTemplate.get(UsersRoles.class, id);
	}

	@Override
	public void updateUsersRoles(UsersRoles Roles) {
		hibernateTemplate.update(Roles);
	}

	@Override
	public void deleteUserRoles(int id) {
		hibernateTemplate.delete(hibernateTemplate.load(UsersRoles.class, id));

	}

}
