package knh.t7.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.service.user.DeleteService;

@Controller
@RequestMapping("user/")
public class DeleteController {

	@Autowired
	private DeleteService deleteService;
	
	@GetMapping("deleteAcount")
	public String deleteAcount(@RequestParam("id") int id, Model model) {
		deleteService.deleteUserById(id);
		return "redirect:/user/showSignUp";
	}
	
	
}
