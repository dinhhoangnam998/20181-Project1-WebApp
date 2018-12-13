package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Author;
import knh.t7.repository.AuthorJpa;

@Service
public class AuthorService {

	@Autowired
	private AuthorJpa authorJpa;

	public List<Author> getAll() {
		return authorJpa.findAll();
	}

	public Author getById(int id) {
		return authorJpa.getOne(id);
	}

	public void update(Author author) {
		authorJpa.save(author);
	}

	public void deleteById(int id) {
		authorJpa.deleteById(id);
	}

}
