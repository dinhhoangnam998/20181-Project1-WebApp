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

import knh.t7.model.Author;
import knh.t7.service.admin.AuthorService;

@Controller
@RequestMapping("admin/")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@GetMapping(value = { "showAuthor", "author" })
	public String showAuthor(Model model) {
		List<Author> authorList = authorService.getAll();
		model.addAttribute("authorList", authorList);
		return "admin/author/showAuthor";
	}

	@GetMapping("showAddAuthor")
	public String showAddAuthor(Model model) {
		model.addAttribute("author", new Author());
		return "admin/author/showAddAuthor";
	}

	@PostMapping("addAuthor")
	public String addAuthor(@ModelAttribute("author") Author author) {
		authorService.save(author);
		return "redirect:admin/author/showAuthor";
	}

	@GetMapping("showEditAuthor")
	public String showEditAuthor(@RequestParam("id") int id, Model model) {
		Author author = authorService.getById(id);
		model.addAttribute("author", author);
		return "admin/author/showEditAuthor";
	}

	@PostMapping("editAuthor")
	public String editAuthor(@ModelAttribute("author") Author author) {
		authorService.update(author);
		return "redirect:admin/author/showAuthor";
	}

	@GetMapping("deleteAuthor")
	public String deleteAuthor(@RequestParam("id") int id) {
		authorService.deleteById(id);
		return "redirect:admin/author/showAuthor";
	}
}
