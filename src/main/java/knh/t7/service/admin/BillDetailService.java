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

	public List<BillDetail> getAll() {
		return billDetailJpa.findAll();
	}

	public BillDetail getById(int id) {
		return billDetailJpa.getOne(id);
	}

	public void update(BillDetail billDetail) {
		billDetailJpa.save(billDetail);
	}

	public void deleteById(int id) {
		billDetailJpa.deleteById(id);
	}

	public void save(BillDetail billDetail) {
		billDetailJpa.save(billDetail);

	}

}
