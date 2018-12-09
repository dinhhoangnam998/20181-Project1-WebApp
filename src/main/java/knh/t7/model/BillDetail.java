package knh.t7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BillDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(columnDefinition = "int unsigned default 1")
	private int quantity;

	@ManyToOne
	private Bill bill;

	@OneToOne
	private Book book;

	@OneToOne
	private Book_SaleEvent book_saleevent;

	@OneToOne
	private Book_InputEvent book_inputevent;

	public BillDetail() {
		super();
	}

	public BillDetail(int quantity, Bill bill, Book book, Book_SaleEvent book_saleevent,
			Book_InputEvent book_inputevent) {
		super();
		this.quantity = quantity;
		this.bill = bill;
		this.book = book;
		this.book_saleevent = book_saleevent;
		this.book_inputevent = book_inputevent;
	}

	public BillDetail(int id, int quantity, Bill bill, Book book, Book_SaleEvent book_saleevent,
			Book_InputEvent book_inputevent) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.bill = bill;
		this.book = book;
		this.book_saleevent = book_saleevent;
		this.book_inputevent = book_inputevent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Book_SaleEvent getBook_saleevent() {
		return book_saleevent;
	}

	public void setBook_saleevent(Book_SaleEvent book_saleevent) {
		this.book_saleevent = book_saleevent;
	}

	public Book_InputEvent getBook_inputevent() {
		return book_inputevent;
	}

	public void setBook_inputevent(Book_InputEvent book_inputevent) {
		this.book_inputevent = book_inputevent;
	}

	@Override
	public String toString() {
		return "BillDetail [id=" + id + ", quantity=" + quantity + ", bill=" + bill + ", book=" + book
				+ ", book_saleevent=" + book_saleevent + ", book_inputevent=" + book_inputevent + "]";
	}

}
