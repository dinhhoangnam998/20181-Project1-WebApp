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
@RequestMapping("admin/inputEvent/")
public class InputEventController {

	@Autowired
	private InputEventService inputEventService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<InputEvent> listInputEvent = inputEventService.getAll();
		model.addAttribute("listInputEvent", listInputEvent);
		return "admin/inputEvent/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("inputEvent", new InputEvent());
		return "admin/inputEvent/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("inputEvent") InputEvent inputEvent) {
		inputEventService.save(inputEvent);
		return "redirect:/admin/inputEvent/";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		InputEvent inputEvent = inputEventService.getById(id);
		model.addAttribute("inputEvent", inputEvent);
		return "admin/inputEvent/edit";
	}

	@PostMapping("edit")
	public String editInputEvent(@ModelAttribute("inputEvent") InputEvent inputEvent) {
		inputEventService.update(inputEvent);
		return "redirect:/admin/inputEvent/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		inputEventService.deleteById(id);
		return "redirect:/admin/inputEvent/";
	}
}
