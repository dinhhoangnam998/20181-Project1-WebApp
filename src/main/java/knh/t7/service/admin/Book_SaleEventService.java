package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Book_SaleEvent;
import knh.t7.repository.Book_SaleEventJpa;
@Service
public class Book_SaleEventService {
	@Autowired
	private Book_SaleEventJpa book_SaleEventJpa;

	public List<Book_SaleEvent> getAll() {
		return book_SaleEventJpa.findAll();
	}

	public Book_SaleEvent getById(int id) {
		return book_SaleEventJpa.getOne(id);
	}

	public void update(Book_SaleEvent book_SaleEvent) {
		book_SaleEventJpa.save(book_SaleEvent);
	}

	public void deleteById(int id) {
		book_SaleEventJpa.deleteById(id);
	}

	public void save(Book_SaleEvent book_SaleEvent) {
		book_SaleEventJpa.save(book_SaleEvent);

	}
}
