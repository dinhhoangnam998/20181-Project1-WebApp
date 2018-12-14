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

import knh.t7.model.Book_InputEvent;
import knh.t7.service.admin.Book_InputEventService;
@Controller
@RequestMapping("admin/")
public class Book_InputEventController {
	@Autowired
	private Book_InputEventService book_InputEventService;

	@GetMapping(value = { "showBook_InputEvent", "book_InputEvent" })
	public String showBook_InputEvent(Model model) {
		List<Book_InputEvent> book_InputEventList = book_InputEventService.getAll();
		model.addAttribute("book_InputEventList", book_InputEventList);
		return "admin/book_InputEvent/showBook_InputEvent";
	}

	@GetMapping("showAddBook_InputEvent")
	public String showAddBook_InputEvent(Model model) {
		model.addAttribute("book_InputEvent", new Book_InputEvent());
		return "admin/book_InputEvent/showAddBook_InputEvent";
	}

	@PostMapping("addBook_InputEvent")
	public String addBook_InputEvent(@ModelAttribute("book_InputEvent") Book_InputEvent book_InputEvent) {
		book_InputEventService.save(book_InputEvent);
		return "redirect:/admin/showBook_InputEvent";
	}

	@GetMapping("showEditBook_InputEvent")
	public String showEditBook_InputEvent(@RequestParam("id") int id, Model model) {
		Book_InputEvent book_InputEvent = book_InputEventService.getById(id);
		model.addAttribute("book_InputEvent", book_InputEvent);
		return "admin/book_InputEvent/showEditBook_InputEvent";
	}

	@PostMapping("editBook_InputEvent")
	public String editBook_InputEvent(@ModelAttribute("book_InputEvent") Book_InputEvent book_InputEvent) {
		book_InputEventService.update(book_InputEvent);
		return "redirect:/admin/showBook_InputEvent";
	}

	@GetMapping("deleteBook_InputEvent")
	public String deleteBook_InputEvent(@RequestParam("id") int id) {
		book_InputEventService.deleteById(id);
		return "redirect:/admin/showBook_InputEvent";
	}
}
