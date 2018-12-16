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

import knh.t7.model.Category;
import knh.t7.service.admin.CategoryService;

@Controller
@RequestMapping("admin/category/")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<Category> listCategory = categoryService.getAll();
		model.addAttribute("listCategory", listCategory);
		return "admin/category/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("category", new Category());
		return "admin/category/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("category") Category category) {
		categoryService.save(category);
		return "redirect:/admin/category/";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		Category category = categoryService.getById(id);
		model.addAttribute("category", category);
		return "admin/category/edit";
	}

	@PostMapping("edit")
	public String editCategory(@ModelAttribute("category") Category category) {
		categoryService.update(category);
		return "redirect:/admin/category/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		categoryService.deleteById(id);
		return "redirect:/admin/category/";
	}
}
