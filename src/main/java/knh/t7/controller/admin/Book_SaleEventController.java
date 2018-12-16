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
@RequestMapping("admin/book_SaleEvent/")
public class Book_SaleEventController {

	@Autowired
	private Book_SaleEventService book_SaleEventService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<Book_SaleEvent> listBook_SaleEvent = book_SaleEventService.getAll();
		model.addAttribute("listBook_SaleEvent", listBook_SaleEvent);
		return "admin/book_SaleEvent/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("book_SaleEvent", new Book_SaleEvent());
		return "admin/book_SaleEvent/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("book_SaleEvent") Book_SaleEvent book_SaleEvent) {
		book_SaleEventService.save(book_SaleEvent);
		return "redirect:/admin/book_SaleEvent/";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		Book_SaleEvent book_SaleEvent = book_SaleEventService.getById(id);
		model.addAttribute("book_SaleEvent", book_SaleEvent);
		return "admin/book_SaleEvent/edit";
	}

	@PostMapping("edit")
	public String editBook_SaleEvent(@ModelAttribute("book_SaleEvent") Book_SaleEvent book_SaleEvent) {
		book_SaleEventService.update(book_SaleEvent);
		return "redirect:/admin/book_SaleEvent/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		book_SaleEventService.deleteById(id);
		return "redirect:/admin/book_SaleEvent/";
	}
}
