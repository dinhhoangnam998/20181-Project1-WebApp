package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Type;
import knh.t7.repository.TypeJpa;

@Service
public class TypeService {
	@Autowired
	private TypeJpa typeJpa;

	public List<Type> getAll() {
		return typeJpa.findAll();
	}

	public Type getById(int id) {
		return typeJpa.getOne(id);
	}

	public void update(Type type) {
		typeJpa.save(type);
	}

	public void deleteById(int id) {
		typeJpa.deleteById(id);
	}

	public void save(Type type) {
		typeJpa.save(type);
	}
}
