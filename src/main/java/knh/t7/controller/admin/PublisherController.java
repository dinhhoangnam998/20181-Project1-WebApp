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

import knh.t7.model.Publisher;
import knh.t7.service.admin.PublisherService;

@Controller
@RequestMapping("admin/publisher/")
public class PublisherController {

	@Autowired
	private PublisherService publisherService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<Publisher> listPublisher = publisherService.getAll();
		model.addAttribute("listPublisher", listPublisher);
		return "admin/publisher/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("publisher", new Publisher());
		return "admin/publisher/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("publisher") Publisher publisher) {
		publisherService.save(publisher);
		// hereS
		return "redirect:/admin/publisher/add";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		Publisher publisher = publisherService.getById(id);
		model.addAttribute("publisher", publisher);
		return "admin/publisher/edit";
	}

	@PostMapping("edit")
	public String editPublisher(@ModelAttribute("publisher") Publisher publisher) {
		publisherService.update(publisher);
		return "redirect:/admin/publisher/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		publisherService.deleteById(id);
		return "redirect:/admin/publisher/";
	}
}
