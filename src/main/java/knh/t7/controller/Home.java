package knh.t7.controller;

import java.util.List;

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
		
		
		List<Book> list = bookJpa.findAll();
		model.addAttribute("list", list);
		
		return "index";
	}
}
