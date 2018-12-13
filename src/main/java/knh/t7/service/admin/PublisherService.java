package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Publisher;
import knh.t7.repository.PublisherJpa;

@Service
public class PublisherService {
	@Autowired
	private PublisherJpa publisherJpa;

	public List<Publisher> getAll() {
		return publisherJpa.findAll();
	}

	public Publisher getById(int id) {
		return publisherJpa.getOne(id);
	}

	public void update(Publisher publisher) {
		publisherJpa.save(publisher);
	}

	public void deleteById(int id) {
		publisherJpa.deleteById(id);
	}
}
