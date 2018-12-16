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
@RequestMapping("admin/book_InputEvent/")
public class Book_InputEventController {

	@Autowired
	private Book_InputEventService book_InputEventService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<Book_InputEvent> listBook_InputEvent = book_InputEventService.getAll();
		model.addAttribute("listBook_InputEvent", listBook_InputEvent);
		return "admin/book_InputEvent/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("book_InputEvent", new Book_InputEvent());
		return "admin/book_InputEvent/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("book_InputEvent") Book_InputEvent book_InputEvent) {
		book_InputEventService.save(book_InputEvent);
		return "redirect:/admin/book_InputEvent/";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		Book_InputEvent book_InputEvent = book_InputEventService.getById(id);
		model.addAttribute("book_InputEvent", book_InputEvent);
		return "admin/book_InputEvent/edit";
	}

	@PostMapping("edit")
	public String editBook_InputEvent(@ModelAttribute("book_InputEvent") Book_InputEvent book_InputEvent) {
		book_InputEventService.update(book_InputEvent);
		return "redirect:/admin/book_InputEvent/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		book_InputEventService.deleteById(id);
		return "redirect:/admin/book_InputEvent/";
	}
}
