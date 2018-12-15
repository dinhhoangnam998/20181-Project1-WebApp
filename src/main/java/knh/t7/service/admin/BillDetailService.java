package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.BillDetail;
import knh.t7.repository.BillDetailJpa;

@Service
public class BillDetailService {

	@Autowired
	private BillDetailJpa billDetailJpa;
	
	public List<BillDetail> getBillDetailList(int billId) {
		if(billId == 0)
			return billDetailJpa.findAll();
		else
			return billDetailJpa.findByBillId(billId);
	}

}
