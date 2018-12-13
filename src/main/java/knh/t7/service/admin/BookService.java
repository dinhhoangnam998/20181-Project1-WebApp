package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Book;
import knh.t7.repository.BookJpa;

@Service
public class BookService {
	@Autowired
	private BookJpa bookJpa;

	public List<Book> getAll() {
		return bookJpa.findAll();
	}

	public Book getById(int id) {
		return bookJpa.getOne(id);
	}

	public void update(Book book) {
		bookJpa.save(book);
	}

	public void deleteById(int id) {
		bookJpa.deleteById(id);
	}
}
