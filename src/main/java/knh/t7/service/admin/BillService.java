package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Bill;
import knh.t7.repository.BillJpa;

@Service
public class BillService {

	@Autowired
	private BillJpa billJpa;

	public List<Bill> getAll() {
		return billJpa.findAll();
	}

	public Bill getById(int id) {
		return billJpa.getOne(id);
	}

	public void update(Bill bill) {
		billJpa.save(bill);
	}

	public void deleteById(int id) {
		billJpa.deleteById(id);
	}

	public void save(Bill bill) {
		billJpa.save(bill);

	}

}
