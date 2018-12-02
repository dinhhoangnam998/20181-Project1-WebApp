package knh.t7.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Entity
public class Book_InputDate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable=false, columnDefinition="int unsigned")
	private int coverprice;
	
	@Column(nullable=false, columnDefinition="int unsigned")
	private int quantity;

	@OneToOne
	private Book book;

	@OneToOne
	private InputDate inputdate;

	public Book_InputDate() {
		super();
	}

	public Book_InputDate(int coverprice, int quantity, Book book, InputDate inputdate) {
		super();
		this.coverprice = coverprice;
		this.quantity = quantity;
		this.book = book;
		this.inputdate = inputdate;
	}

	public Book_InputDate(int id, int coverprice, int quantity, Book book, InputDate inputdate) {
		super();
		this.id = id;
		this.coverprice = coverprice;
		this.quantity = quantity;
		this.book = book;
		this.inputdate = inputdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCoverprice() {
		return coverprice;
	}

	public void setCoverprice(int coverprice) {
		this.coverprice = coverprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public InputDate getInputdate() {
		return inputdate;
	}

	public void setInputdate(InputDate inputdate) {
		this.inputdate = inputdate;
	}

	@Override
	public String toString() {
		return "Book_InputDate [id=" + id + ", coverprice=" + coverprice + ", quantity=" + quantity + ", book=" + book
				+ ", inputdate=" + inputdate + "]";
	}

}
