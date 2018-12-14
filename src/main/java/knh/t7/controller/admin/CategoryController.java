package knh.t7.controller.admin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
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

	@InitBinder
	public void bindingPreparation(WebDataBinder binder) {
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
		CustomDateEditor customDate = new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, customDate);
	}

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
		return "redirect:/admin/showCategory";
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
		return "redirect:/admin/showCategory";
	}

	@GetMapping("deleteCategory")
	public String deleteCategory(@RequestParam("id") int id) {
		categoryService.deleteById(id);
		return "redirect:/admin/showCategory";
	}
}
