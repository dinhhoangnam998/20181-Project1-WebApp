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
import knh.t7.model.Category;
import knh.t7.model.Creation;
import knh.t7.service.admin.CreationService;

@Controller
@RequestMapping("admin/creation/")
public class CreationController {

	@Autowired
	private CreationService creationService;

	@GetMapping(value = { "", "show" })
	public String show(Model model) {
		List<Creation> listCreation = creationService.getAll();
		model.addAttribute("listCreation", listCreation);
		return "admin/creation/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("creation", new Creation("yourcreationhere", "yourdescriptionhere", 1, 1));

		List<Category> listCategory = creationService.getAllCategory();
		List<Author> listAuthor = creationService.getAllAuthor();

		model.addAttribute("listCategory", listCategory);
		model.addAttribute("listAuthor", listAuthor);
		return "admin/creation/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("creation") Creation creation) {
		creationService.save(creation);
		return "redirect:/admin/creation/";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		Creation creation = creationService.getById(id);
		model.addAttribute("creation", creation);

		List<Category> listCategory = creationService.getAllCategory();
		List<Author> listAuthor = creationService.getAllAuthor();

		model.addAttribute("listCategory", listCategory);
		model.addAttribute("listAuthor", listAuthor);
		return "admin/creation/edit";
	}

	@PostMapping("edit")
	public String editCreation(@ModelAttribute("creation") Creation creation) {
		creationService.update(creation);
		return "redirect:/admin/creation/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		creationService.deleteById(id);
		return "redirect:/admin/creation/";
	}
}
