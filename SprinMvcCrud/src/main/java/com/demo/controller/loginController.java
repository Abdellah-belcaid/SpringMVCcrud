package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.layer.UserDAO;
import com.demo.dao.layer.UsersRolesDAO;
import com.demo.models.Users;
import com.demo.models.UsersRoles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {

	@Autowired
	UserDAO userDAO;
	@Autowired
	UsersRolesDAO usersRolesDAO;

	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public String RegisterPage(ModelMap model) {
		model.addAttribute("title", "register");
		return "register";
	}

	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public String Register(Users user ) {
		userDAO.addUser(user);
		usersRolesDAO.addUserRoles(new UsersRoles("ROLE_USER", user));
		return "redirect:/";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		model.addAttribute("title", "login");
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
			request.getSession().invalidate();
		}
		return "redirect:/login";
	}

}
