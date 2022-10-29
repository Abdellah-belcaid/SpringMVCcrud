package com.demo.dao.layer;

import java.util.List;

import com.demo.models.UsersRoles;

public interface UsersRolesDAO {

	void addUserRoles(UsersRoles Role);

	List<UsersRoles> getAllUsersRoles();

	UsersRoles getUserRoleById(int id);

	void updateUsersRoles(UsersRoles Roles);

	void deleteUserRoles(int id);

}
