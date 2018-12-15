package knh.t7.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.BillDetail;
import knh.t7.service.admin.BillDetailService;

@Controller
@RequestMapping("admin/")
public class BillDetailController {

	@Autowired
	private BillDetailService billDetailService;

	@GetMapping(value = { "showBillDetail", "billDetail" })
	public String showBillDetail(@RequestParam(value="billId", defaultValue="0") int billId, Model model) {
		List<BillDetail> billDetailList = billDetailService.getBillDetailList(billId);
		model.addAttribute("billDetailList", billDetailList);
		return "admin/billDetail/showBillDetail";
	}


}
