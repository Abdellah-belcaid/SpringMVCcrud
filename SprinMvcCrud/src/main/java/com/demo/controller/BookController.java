package com.demo.controller;

import com.demo.dao.layer.AuthorDAO;
import com.demo.dao.layer.BookDAO;
import com.demo.models.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

	@Autowired
	private BookDAO bookDAO;

	@Autowired
	private AuthorDAO authorDAO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String WelcomPage(ModelMap model) {
		model.addAttribute("title", "Welcome");
		return "index";
	}

	@RequestMapping(value = "/Books/view", method = RequestMethod.GET)
	public String viewBooksPage(ModelMap model) {
		model.addAttribute("title", "Books");
		model.addAttribute("Books", bookDAO.getAllBooks());
		return "view_books";
	}

	@RequestMapping(value = "/Books-Authors/add", method = RequestMethod.GET)
	public String addPage(ModelMap model) {
		model.addAttribute("title", "add Book/Author ");
		model.addAttribute("Authors", authorDAO.getAllAuthors());
		return "add_book";
	}

	@RequestMapping(value = "/Books/add", method = RequestMethod.POST)
	public String addBook(@ModelAttribute("add_book") Book book, @RequestParam int author_id) {
		book.setAuthor(authorDAO.getAuthorById(author_id));
		bookDAO.addBook(book);
		return "redirect:/Books/view";
	}

	@RequestMapping(value = "/Books/delete/{id}", method = RequestMethod.GET)
	public String DeleteBook(@PathVariable(name = "id") int id) {
		bookDAO.deleteBook(id);
		return "redirect:/Books/view";
	}

	@RequestMapping(value = "/Books/update/{id}", method = RequestMethod.GET)
	public ModelAndView editBookPage(@PathVariable(name = "id") int id, ModelMap model) {
		model.addAttribute("title", "Edit Book");
		model.addAttribute("Authors", authorDAO.getAllAuthors());
		return new ModelAndView("edit_book", "book", bookDAO.getBookById(id));
	}

	@RequestMapping(value = "/Books/update", method = RequestMethod.POST)
	public String editBook(Book book, @RequestParam int author_id) {
		book.setAuthor(authorDAO.getAuthorById(author_id));
		bookDAO.updateBook(book);
		return "redirect:/Books/view";
	}

}
