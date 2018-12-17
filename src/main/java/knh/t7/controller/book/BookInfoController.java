package knh.t7.controller.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.Book;
import knh.t7.service.book.BookInfoService;

@Controller
@RequestMapping("book/")
public class BookInfoController {

	@Autowired
	private BookInfoService bookInfoService;
	
	@GetMapping("info")
	public String info(@RequestParam("id") int id, Model model) {
		
		Book book = bookInfoService.getBookById(id);
		model.addAttribute("book", book);
		return "book/info";
	}
	
}
