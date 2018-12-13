package knh.t7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.User;
import knh.t7.service.SignUpService;

@Controller
public class SignUpController {

	@Autowired
	private SignUpService signUpService;

	@GetMapping("showSignUp")
	public String showSignUp(Model model) {
		model.addAttribute("user", new User());
		return "user/showSignUp";
	}

	@PostMapping("singUp")
	public String signUp(@ModelAttribute("user") User user, @RequestParam String address, @RequestParam String phonenumber) {
			

		if(signUpService.signUp(user, address, phonenumber)) {

			return "redirect:user/showSignIn";
		}
		else 
			return "redirect:user/showSignUp";
			
			

	}
}
