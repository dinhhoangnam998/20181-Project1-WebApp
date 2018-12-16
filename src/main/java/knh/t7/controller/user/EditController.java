package knh.t7.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.User;
import knh.t7.service.user.EditService;

@Controller
@RequestMapping("user/")
public class EditController {

	@Autowired
	private EditService editService;
	
	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		User user = editService.getUserById(id);
		model.addAttribute("user", user);
		return "user/edit";
	}
	
	@PostMapping("edit")
	public String edit(@ModelAttribute("user") User user, Model model) {
		int retvl = editService.editProfile(user);
		if(retvl == -1) {
			return "redirect:/user/info" + "?id=" + user.getId();
		}
		else {
			model.addAttribute("errorCode", retvl);
			return "redirect:/user/editFailure";
		}
	}
	
	@GetMapping("editFailure")
	public String editFailure(Model model) {
		return "user/editFailure";
	}
	
}
