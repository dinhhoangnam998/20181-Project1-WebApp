package knh.t7.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.Book;
import knh.t7.service.admin.BookService;

@Controller
@RequestMapping("admin/book/")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<Book> listBook = bookService.getAll();
		model.addAttribute("listBook", listBook);
		return "admin/book/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("book", new Book());
		return "admin/book/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("book") Book book) {
		bookService.save(book);
		return "redirect:/admin/book/";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		Book book = bookService.getById(id);
		model.addAttribute("book", book);
		return "admin/book/edit";
	}

	@PostMapping("edit")
	public String editBook(@ModelAttribute("book") Book book) {
		bookService.update(book);
		return "redirect:/admin/book/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		bookService.deleteById(id);
		return "redirect:/admin/book/";
	}
}
