package knh.t7.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.service.user.SignInService;

@Controller
@RequestMapping("user/")
public class SignInController {

	@Autowired
	private SignInService signInService;

	@GetMapping("signIn")
	public String showSignIn(Model model) {
		return "/user/signIn";
	}

	@PostMapping("signIn")
	public String signIn(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		if (signInService.checkSignIn(username, password)) {
			return "redirect:/";
		} else {
			return "redirect:/user/signInFailure";
		}

	}
	
	@GetMapping("signInFailure")
	public String showSignInFailure(Model model) {
		return "/user/signInFailure";
	}
}
