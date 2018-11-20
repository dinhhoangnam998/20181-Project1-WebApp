package knh.t7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import knh.t7.model.User;
import knh.t7.service.RegistryService;

@Controller
public class RegistryController {
	
	@Autowired
	private RegistryService registryService;
	
	@RequestMapping(value="registry")
	public String showRegistry(Model model) {
		model.addAttribute("user", new User("username", "password"));
		return "registry";
	}

	@RequestMapping(value="userRegistry")
	public String registry(@ModelAttribute("user") User user, Model model) {
		if(registryService.registry(user)) {
			return "redirect:login";
		} else {
			model.addAttribute("error", true);
			return "redirect:registry";
		}
		
		
	}
	
}
