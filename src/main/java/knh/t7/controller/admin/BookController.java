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
@RequestMapping("admin/")
public class BookController {
	@Autowired
	private BookService bookService;

	@GetMapping(value = { "showBook", "book" })
	public String showBook(Model model) {
		List<Book> bookList = bookService.getAll();
		model.addAttribute("bookList", bookList);
		return "admin/book/showBook";
	}

	@GetMapping("showAddBook")
	public String showAddBook(Model model) {
		model.addAttribute("book", new Book());
		return "admin/book/showAddBook";
	}

	@PostMapping("addBook")
	public String addBook(@ModelAttribute("book") Book book, @RequestParam("creation_id") int creation_id,
			@RequestParam("type_id") int type_id, @RequestParam("publisher_id") int publisher_id) {
		bookService.save(book, creation_id, type_id, publisher_id);
		return "redirect:admin/book/showBook";
	}

	@GetMapping("showEditBook")
	public String showEditBook(@RequestParam("id") int id, Model model) {
		Book book = bookService.getById(id);
		model.addAttribute("book", book);
		return "admin/book/showEditBook";
	}

	@PostMapping("editBook")
	public String editBook(@ModelAttribute("book") Book book, @RequestParam("creation_id") int creation_id,
			@RequestParam("type_id") int type_id, @RequestParam("publisher_id") int publisher_id) {
		bookService.update(book, creation_id, type_id, publisher_id);
		return "redirect:admin/book/showBook";
	}

	@GetMapping("deleteBook")
	public String deleteBook(@RequestParam("id") int id) {
		bookService.deleteById(id);
		return "redirect:admin/book/showBook";
	}
}