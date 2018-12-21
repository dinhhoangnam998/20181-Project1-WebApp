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

import knh.t7.model.BillDetail;
import knh.t7.service.admin.BillDetailService;

@Controller
@RequestMapping("admin/billDetail/")
public class BillDetailController {

	@Autowired
	private BillDetailService billDetailService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<BillDetail> listBillDetail = billDetailService.getAll();
		model.addAttribute("listBillDetail", listBillDetail);
		return "admin/billDetail/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("billDetail", new BillDetail());
		return "admin/billDetail/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("billDetail") BillDetail billDetail) {
		billDetailService.save(billDetail);
		// here need replace
		return "redirect:/admin/billDetail/add";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		BillDetail billDetail = billDetailService.getById(id);
		model.addAttribute("billDetail", billDetail);
		return "admin/billDetail/edit";
	}

	@PostMapping("edit")
	public String editBillDetail(@ModelAttribute("billDetail") BillDetail billDetail) {
		billDetailService.update(billDetail);
		return "redirect:/admin/billDetail/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		billDetailService.deleteById(id);
		return "redirect:/admin/billDetail/";
	}
}
