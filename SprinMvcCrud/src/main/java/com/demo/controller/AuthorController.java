package com.demo.controller;

import com.demo.dao.layer.AuthorDAO;
import com.demo.models.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthorController {

	@Autowired
	private AuthorDAO authorDAO;

	@RequestMapping(value = "/Authors/view", method = RequestMethod.GET)
	public String viewAuthorsPage(ModelMap model) {
		model.addAttribute("title", "Authors");
		model.addAttribute("Authors", authorDAO.getAllAuthors());
		return "view_authors";
	}

	@RequestMapping(value = "/Authors/add", method = RequestMethod.POST)
	public String addAuthor(Author author,ModelMap model) {		
		authorDAO.addAuthor(author);
		return "redirect:/Authors/view";
	}

	@RequestMapping(value = "/Authors/delete/{id}", method = RequestMethod.GET)
	public String DeleteAuthor(@PathVariable(name = "id") int id) {		
		authorDAO.deleteAuthor(id);
		return "redirect:/Authors/view";
	}

	@RequestMapping(value = "/Authors/update/{id}", method = RequestMethod.GET)
	public ModelAndView editAuthorPage(@PathVariable(name = "id") int id,ModelMap model) {
		model.addAttribute("title", "Edit Author");
		return new ModelAndView("edit_author", "author", authorDAO.getAuthorById(id));
	}

	@RequestMapping(value = "/Authors/update", method = RequestMethod.POST)
	public String editAuthor(Author author) {
		authorDAO.updateAuthor(author);
		return "redirect:/Authors/view";
	}

}
