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
import knh.t7.model.Creation;
import knh.t7.model.Publisher;
import knh.t7.model.Type;
import knh.t7.service.admin.BookService;

@Controller
@RequestMapping("admin/book/")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping(value = { "", "show" })
	public String show(Model model) {
		List<Book> listBook = bookService.getAll();
		model.addAttribute("listBook", listBook);
		return "admin/book/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("book", new Book("japan", 72, 5, "default", 20, 25, 15, 80, "yourdescriptionhere",
				"yourcommenthere", "yourimageurlhere", 1, 1, 1));

		List<Creation> listCreation = bookService.getAllCreation();
		List<Type> listType = bookService.getAllType();
		List<Publisher> listPublisher = bookService.getAllPublisher();

		model.addAttribute("listCreation", listCreation);
		model.addAttribute("listType", listType);
		model.addAttribute("listPublisher", listPublisher);

		return "admin/book/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("book") Book book) {
		bookService.save(book);
		// need replace
		return "redirect:/admin/book/add";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		Book book = bookService.getById(id);
		model.addAttribute("book", book);

		List<Creation> listCreation = bookService.getAllCreation();
		List<Type> listType = bookService.getAllType();
		List<Publisher> listPublisher = bookService.getAllPublisher();

		model.addAttribute("listCreation", listCreation);
		model.addAttribute("listType", listType);
		model.addAttribute("listPublisher", listPublisher);
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
