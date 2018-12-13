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
@RequestMapping("admin/")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping(value = { "showCategory", "category" })
	public String showCategory(Model model) {
		List<Category> categoryList = categoryService.getAll();
		model.addAttribute("categoryList", categoryList);
		return "admin/category/showCategory";
	}

	@GetMapping("showAddCategory")
	public String showAddCategory(Model model) {
		model.addAttribute("category", new Category());
		return "admin/category/showAddCategory";
	}

	@PostMapping("addCategory")
	public String addCategory(@ModelAttribute("category") Category category) {
		categoryService.save(category);
		return "redirect:admin/category/showCategory";
	}

	@GetMapping("showEditCategory")
	public String showEditCategory(@RequestParam("id") int id, Model model) {
		Category category = categoryService.getById(id);
		model.addAttribute("category", category);
		return "admin/category/showEditCategory";
	}

	@PostMapping("editCategory")
	public String editCategory(@ModelAttribute("category") Category category) {
		categoryService.update(category);
		return "redirect:admin/category/showCategory";
	}

	@GetMapping("deleteCategory")
	public String deleteCategory(@RequestParam("id") int id) {
		categoryService.deleteById(id);
		return "redirect:admin/category/showCategory";
	}
}
