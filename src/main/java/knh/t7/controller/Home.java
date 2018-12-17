package knh.t7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import knh.t7.model.Book;
import knh.t7.repository.BookJpa;

@Controller
public class Home {

	@Autowired
	private BookJpa bookJpa;
	
	@GetMapping(value= {"/", "/index"})
	public String showIndex(Model model) {
		
		Book book1 = bookJpa.getOne(1);
		Book book2 = bookJpa.getOne(2);
		Book book3 = bookJpa.getOne(3);
		Book book4 = bookJpa.getOne(4);
		Book book5 = bookJpa.getOne(5);
		Book book6 = bookJpa.getOne(6);
		
		model.addAttribute("book1", book1);
		model.addAttribute("book2", book2);
		model.addAttribute("book3", book3);
		model.addAttribute("book4", book4);
		model.addAttribute("book5", book5);
		model.addAttribute("book6", book6);
		
		return "index";
	}
}
