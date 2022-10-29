package com.demo.dao.layer;

import java.util.List;

import com.demo.models.Users;

public interface UserDAO {

	void addUser(Users User);

	List<Users> getAllUsers();

	Users getUserById(int id);

	void updateUser(Users Users);

	void deleteUser(int id);

}
