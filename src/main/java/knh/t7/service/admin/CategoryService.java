package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Category;
import knh.t7.repository.CategoryJpa;

@Service
public class CategoryService {
	@Autowired
	private CategoryJpa categoryJpa;

	public List<Category> getAll() {
		return categoryJpa.findAll();
	}

	public Category getById(int id) {
		return categoryJpa.getOne(id);
	}

	public void update(Category category) {
		categoryJpa.save(category);
	}

	public void deleteById(int id) {
		categoryJpa.deleteById(id);
	}

	public void save(Category category) {
		categoryJpa.save(category);
	}
}
