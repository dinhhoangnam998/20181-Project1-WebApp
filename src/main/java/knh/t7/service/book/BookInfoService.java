package knh.t7.service.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Book;
import knh.t7.repository.BookJpa;

@Service
public class BookInfoService {

	@Autowired
	private BookJpa bookJpa;
	
	public Book getBookById(int id) {
		Book book = bookJpa.getOne(id);
		return book;
	}

}
