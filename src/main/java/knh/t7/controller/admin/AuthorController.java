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
@RequestMapping("admin/author/")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<Author> listAuthor = authorService.getAll();
		model.addAttribute("listAuthor", listAuthor);
		return "admin/author/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("author", new Author());
		return "admin/author/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("author") Author author) {
		authorService.save(author);
		// here need replace
		return "redirect:/admin/author/add";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		Author author = authorService.getById(id);
		model.addAttribute("author", author);
		return "admin/author/edit";
	}

	@PostMapping("edit")
	public String editAuthor(@ModelAttribute("author") Author author) {
		authorService.update(author);
		return "redirect:/admin/author/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		authorService.deleteById(id);
		return "redirect:/admin/author/";
	}
}
