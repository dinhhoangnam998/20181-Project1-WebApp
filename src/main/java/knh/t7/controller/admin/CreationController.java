package knh.t7.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.Creation;
import knh.t7.service.admin.CreationService;

@Controller
@RequestMapping("admin/")
public class CreationController {
	@Autowired
	private CreationService creationService;

	@GetMapping(value = { "showCreation", "creation" })
	public String showCreation(Model model) {
		List<Creation> creationList = creationService.getAll();
		model.addAttribute("creationList", creationList);
		return "admin/creation/showCreation";
	}

	@GetMapping("showEditCreation")
	public String showEditCreation(@RequestParam("id") int id, Model model) {
		Creation creation = creationService.getById(id);
		model.addAttribute("creation", creation);
		return "admin/creation/showEditCreation";
	}

	@PostMapping("editCreation")
	public String editCreation(@ModelAttribute("creation") Creation creation) {
		creationService.update(creation);
		return "redirect:admin/creation/showCreation";
	}

	@GetMapping("deleteCreation")
	public String deleteCreation(@RequestParam("id") int id) {
		creationService.deleteById(id);
		return "redirect:admin/creation/showCreation";
	}
}
