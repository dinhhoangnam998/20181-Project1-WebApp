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

import knh.t7.model.InputEvent;
import knh.t7.service.admin.InputEventService;
@Controller
@RequestMapping("admin/")
public class InputEventController {
	@Autowired
	private InputEventService inputEventService;

	@GetMapping(value = { "showInputEvent", "inputEvent" })
	public String showInputEvent(Model model) {
		List<InputEvent> inputEventList = inputEventService.getAll();
		model.addAttribute("inputEventList", inputEventList);
		return "admin/inputEvent/showInputEvent";
	}

	@GetMapping("showAddInputEvent")
	public String showAddInputEvent(Model model) {
		model.addAttribute("inputEvent", new InputEvent());
		return "admin/inputEvent/showAddInputEvent";
	}

	@PostMapping("addInputEvent")
	public String addInputEvent(@ModelAttribute("inputEvent") InputEvent inputEvent) {
		inputEventService.save(inputEvent);
		return "redirect:/admin/showInputEvent";
	}

	@GetMapping("showEditInputEvent")
	public String showEditInputEvent(@RequestParam("id") int id, Model model) {
		InputEvent inputEvent = inputEventService.getById(id);
		model.addAttribute("inputEvent", inputEvent);
		return "admin/inputEvent/showEditInputEvent";
	}

	@PostMapping("editInputEvent")
	public String editInputEvent(@ModelAttribute("inputEvent") InputEvent inputEvent) {
		inputEventService.update(inputEvent);
		return "redirect:/admin/showInputEvent";
	}

	@GetMapping("deleteInputEvent")
	public String deleteInputEvent(@RequestParam("id") int id) {
		inputEventService.deleteById(id);
		return "redirect:/admin/showInputEvent";
	}
}
