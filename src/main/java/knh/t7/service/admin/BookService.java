package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Book;
import knh.t7.model.Creation;
import knh.t7.model.Publisher;
import knh.t7.model.Type;
import knh.t7.repository.BookJpa;
import knh.t7.repository.CreationJpa;
import knh.t7.repository.PublisherJpa;
import knh.t7.repository.TypeJpa;

@Service
public class BookService {
	@Autowired
	private BookJpa bookJpa;

	@Autowired
	private CreationJpa creationJpa;

	@Autowired
	private TypeJpa typeJpa;

	@Autowired
	private PublisherJpa publisherJpa;

	public List<Book> getAll() {
		return bookJpa.findAll();
	}

	public Book getById(int id) {
		return bookJpa.getOne(id);
	}

	public void update(Book book, int creation_id, int type_id, int publisher_id) {
		Creation creation = creationJpa.getOne(creation_id);
		Type type = typeJpa.getOne(type_id);
		Publisher publisher = publisherJpa.getOne(publisher_id);

		book.setCreation(creation);
		book.setType(type);
		book.setPublisher(publisher);

		bookJpa.save(book);
	}

	public void save(Book book, int creation_id, int type_id, int publisher_id) {
		Creation creation = creationJpa.getOne(creation_id);
		Type type = typeJpa.getOne(type_id);
		Publisher publisher = publisherJpa.getOne(publisher_id);

		book.setCreation(creation);
		book.setType(type);
		book.setPublisher(publisher);

		bookJpa.save(book);

	}

	public void deleteById(int id) {
		bookJpa.deleteById(id);
	}
}
