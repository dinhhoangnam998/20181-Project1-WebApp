package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Creation;
import knh.t7.repository.CreationJpa;

@Service
public class CreationService {
	@Autowired
	private CreationJpa creationJpa;

	public List<Creation> getAll() {
		return creationJpa.findAll();
	}

	public Creation getById(int id) {
		return creationJpa.getOne(id);
	}

	public void update(Creation creation) {
		creationJpa.save(creation);
	}

	public void deleteById(int id) {
		creationJpa.deleteById(id);
	}
}
