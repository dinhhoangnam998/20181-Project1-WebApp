package knh.t7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import knh.t7.model.Category;
import knh.t7.repository.CategoryJpa;

@Controller
public class TestController {

	@Autowired
	private CategoryJpa categoryJpa;

	@GetMapping("test")
	public String test(Model model) {
//		Category category = new Category("Manga");
//		categoryJpa.save(category);
//		model.addAttribute("error", true);
		return "testBackEnd";
	}

	@GetMapping("testMobirise")
	public String testMobirise() {
		return "testMobirise";
	}

	@GetMapping("restController")
	@ResponseBody
	public String restController() {
		return "restController is here, hehe";
	}

}
