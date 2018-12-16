package knh.t7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = false)
public class Book_InputEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, columnDefinition = "int unsigned")
	private int inputprice;

	@Column(nullable = false, columnDefinition = "int unsigned")
	private int quantity;

	@Column(nullable = false, columnDefinition = "int unsigned")
	private int remain;

	@OneToOne
	private Book book = new Book();

	@OneToOne
	private InputEvent inputevent = new InputEvent();

	public Book_InputEvent() {
		super();
	}
	
	public Book_InputEvent(int inputprice, int quantity, int remain, int bookId, int inputeventId) {
		this();
		this.inputprice = inputprice;
		this.quantity = quantity;
		this.remain = remain;
		this.book.setId(bookId);
		this.inputevent.setId(inputeventId);
	}

	public Book_InputEvent(int inputprice, int quantity, int remain, Book book, InputEvent inputevent) {
		super();
		this.inputprice = inputprice;
		this.quantity = quantity;
		this.remain = remain;
		this.book = book;
		this.inputevent = inputevent;
	}

	public Book_InputEvent(int id, int inputprice, int quantity, int remain, Book book, InputEvent inputevent) {
		super();
		this.id = id;
		this.inputprice = inputprice;
		this.quantity = quantity;
		this.remain = remain;
		this.book = book;
		this.inputevent = inputevent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInputprice() {
		return inputprice;
	}

	public void setInputprice(int inputprice) {
		this.inputprice = inputprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public InputEvent getInputevent() {
		return inputevent;
	}

	public void setInputevent(InputEvent inputevent) {
		this.inputevent = inputevent;
	}

	@Override
	public String toString() {
		return "Book_InputEvent [id=" + id + ", inputprice=" + inputprice + ", quantity=" + quantity + ", remain="
				+ remain + ", book=" + book + ", inputevent=" + inputevent + "]";
	}

}
