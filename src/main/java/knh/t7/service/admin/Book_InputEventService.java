package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Book_InputEvent;
import knh.t7.repository.Book_InputEventJpa;
@Service
public class Book_InputEventService {
	@Autowired
	private Book_InputEventJpa book_InputEventJpa;

	public List<Book_InputEvent> getAll() {
		return book_InputEventJpa.findAll();
	}

	public Book_InputEvent getById(int id) {
		return book_InputEventJpa.getOne(id);
	}

	public void update(Book_InputEvent book_InputEvent) {
		book_InputEventJpa.save(book_InputEvent);
	}

	public void deleteById(int id) {
		book_InputEventJpa.deleteById(id);
	}

	public void save(Book_InputEvent book_InputEvent) {
		book_InputEvent.setRemain(book_InputEvent.getQuantity());
		book_InputEventJpa.save(book_InputEvent);

	}
}
