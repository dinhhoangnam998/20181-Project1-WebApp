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

import knh.t7.model.Book_SaleEvent;
import knh.t7.service.admin.Book_SaleEventService;
@Controller
@RequestMapping("admin/")
public class Book_SaleEventController {
	@Autowired
	private Book_SaleEventService book_SaleEventService;

	@GetMapping(value = { "showBook_SaleEvent", "book_SaleEvent" })
	public String showBook_SaleEvent(Model model) {
		List<Book_SaleEvent> book_SaleEventList = book_SaleEventService.getAll();
		model.addAttribute("book_SaleEventList", book_SaleEventList);
		return "admin/book_SaleEvent/showBook_SaleEvent";
	}

	@GetMapping("showAddBook_SaleEvent")
	public String showAddBook_SaleEvent(Model model) {
		model.addAttribute("book_SaleEvent", new Book_SaleEvent());
		return "admin/book_SaleEvent/showAddBook_SaleEvent";
	}

	@PostMapping("addBook_SaleEvent")
	public String addBook_SaleEvent(@ModelAttribute("book_SaleEvent") Book_SaleEvent book_SaleEvent) {
		book_SaleEventService.save(book_SaleEvent);
		return "redirect:/admin/showBook_SaleEvent";
	}

	@GetMapping("showEditBook_SaleEvent")
	public String showEditBook_SaleEvent(@RequestParam("id") int id, Model model) {
		Book_SaleEvent book_SaleEvent = book_SaleEventService.getById(id);
		model.addAttribute("book_SaleEvent", book_SaleEvent);
		return "admin/book_SaleEvent/showEditBook_SaleEvent";
	}

	@PostMapping("editBook_SaleEvent")
	public String editBook_SaleEvent(@ModelAttribute("book_SaleEvent") Book_SaleEvent book_SaleEvent) {
		book_SaleEventService.update(book_SaleEvent);
		return "redirect:/admin/showBook_SaleEvent";
	}

	@GetMapping("deleteBook_SaleEvent")
	public String deleteBook_SaleEvent(@RequestParam("id") int id) {
		book_SaleEventService.deleteById(id);
		return "redirect:/admin/showBook_SaleEvent";
	}
}
