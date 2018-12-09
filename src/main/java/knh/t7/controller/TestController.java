package knh.t7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import knh.t7.model.Category;
import knh.t7.repository.CategoryJpa;

@Controller
public class TestController {

	@Autowired
	private CategoryJpa categoryJpa;
	
	@GetMapping("test")
	public String Test(Model model) {
		Category category = new Category("Manga");
//		categoryJpa.save(category);
//		model.addAttribute("testSuccess", "testSuccess");
		return "testBackEnd";
	}
	
	@GetMapping("testMobirise")
	public String testMobirise() {
		return "testMobirise";
	}
	
}
