package knh.t7.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import knh.t7.model.User;
import knh.t7.service.user.SignUpService;

@Controller
@RequestMapping("user/")
public class SignUpController {

	@Autowired
	private SignUpService signUpService;
	
	@GetMapping("showSignUp")
	public String showSignUp(Model model) {
		model.addAttribute("user", new User());
		return "user/showSignUp";
	}
	
	@PostMapping("signUp")
	public String signUp(@ModelAttribute("user") User user, Model model) {
		int retvl = signUpService.signUp(user);
		if (retvl == -1) {
			return "redirect:/user/showSignUpSuccess";
		}
		
		model.addAttribute("retvl", retvl);
		return "redirect:/user/showSignUpFailure";
	}
	
	@GetMapping("showSignUpSuccess")
	public String showSignUpSuccess(Model model) {
		return "user/showSignUpSuccess";
	}
	
}
