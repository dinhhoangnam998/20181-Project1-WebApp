package knh.t7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import knh.t7.model.User;
import knh.t7.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="login")
	public String showLogin(Model model) {
		model.addAttribute("user", new User("yourUserName", "yourPassWord"));
		return "login";
	}
	
	@RequestMapping(value="dashboard")
	public String login(@ModelAttribute("user") User user, Model model) {
		if(loginService.authenticate(user)) {
			return "dashboard";
		} else {
			model.addAttribute("error", true);
			return "redirect:login";
		}
		
	}
}
