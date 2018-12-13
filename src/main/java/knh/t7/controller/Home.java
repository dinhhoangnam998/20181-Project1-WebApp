package knh.t7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/")
public class Home {

	@GetMapping(value= {"/", "/index"})
	public String showIndex() {
		return "index";
	}
}
