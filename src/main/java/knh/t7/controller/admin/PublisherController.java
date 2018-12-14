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
@RequestMapping("admin/")
public class PublisherController {
	@Autowired
	private PublisherService publisherService;

	@GetMapping(value = { "showPublisher", "publisher" })
	public String showPublisher(Model model) {
		List<Publisher> publisherList = publisherService.getAll();
		model.addAttribute("publisherList", publisherList);
		return "admin/publisher/showPublisher";
	}

	@GetMapping("showAddPublisher")
	public String showAddPublisher(Model model) {
		model.addAttribute("publisher", new Publisher());
		return "admin/publisher/showAddPublisher";
	}

	@PostMapping("addPublisher")
	public String addPublisher(@ModelAttribute("publisher") Publisher publisher) {
		publisherService.save(publisher);
		return "redirect:/admin/showPublisher";
	}

	@GetMapping("showEditPublisher")
	public String showEditPublisher(@RequestParam("id") int id, Model model) {
		Publisher publisher = publisherService.getById(id);
		model.addAttribute("publisher", publisher);
		return "admin/publisher/showEditPublisher";
	}

	@PostMapping("editPublisher")
	public String editPublisher(@ModelAttribute("publisher") Publisher publisher) {
		publisherService.update(publisher);
		return "redirect:/admin/showPublisher";
	}

	@GetMapping("deletePublisher")
	public String deletePublisher(@RequestParam("id") int id) {
		publisherService.deleteById(id);
		return "redirect:/admin/showPublisher";
	}
}
