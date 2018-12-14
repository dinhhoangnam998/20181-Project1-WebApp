package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.SaleEvent;
import knh.t7.repository.SaleEventJpa;

@Service
public class SaleEventService {
	@Autowired
	private SaleEventJpa saleEventJpa;

	public List<SaleEvent> getAll() {
		return saleEventJpa.findAll();
	}

	public SaleEvent getById(int id) {
		return saleEventJpa.getOne(id);
	}

	public void update(SaleEvent saleEvent) {
		saleEventJpa.save(saleEvent);
	}

	public void deleteById(int id) {
		saleEventJpa.deleteById(id);
	}

	public void save(SaleEvent saleEvent) {
		saleEventJpa.save(saleEvent);

	}
}
