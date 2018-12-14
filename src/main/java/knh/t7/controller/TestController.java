package knh.t7.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import knh.t7.model.Author;
import knh.t7.repository.AuthorJpa;
import knh.t7.repository.CategoryJpa;

@Controller
public class TestController {

	@Autowired
	private CategoryJpa categoryJpa;

	@Autowired
	private AuthorJpa authorJpa;

	@GetMapping("hehe/hihi/test")
	public String test(Model model) {
//		Category category = new Category("Manga");
//		categoryJpa.save(category);
//		model.addAttribute("error", true);
		return "redirect:/testMobirise";
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
	
	@GetMapping("testDate")
	@ResponseBody
	public String testDate() {
		Author author = new Author("test date", new Date());
		authorJpa.save(author);
		return author.toString();
	}

}
