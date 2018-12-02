package knh.t7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book_SaleDate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable=false, columnDefinition="int default 0")
	private int salepercent;

	@Column(nullable=false, columnDefinition="int unsigned")
	private int quantity;

	@OneToOne
	private Book book;

	@OneToOne
	private SaleDate saledate;

	public Book_SaleDate() {
		super();
	}

	public Book_SaleDate(int salepercent, int quantity, SaleDate saledate, Book book) {
		super();
		this.salepercent = salepercent;
		this.quantity = quantity;
		this.saledate = saledate;
		this.book = book;
	}

	public Book_SaleDate(int id, int salepercent, int quantity, SaleDate saledate, Book book) {
		super();
		this.id = id;
		this.salepercent = salepercent;
		this.quantity = quantity;
		this.saledate = saledate;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalepercent() {
		return salepercent;
	}

	public void setSalepercent(int salepercent) {
		this.salepercent = salepercent;
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

	public SaleDate getSaledate() {
		return saledate;
	}

	public void setSaledate(SaleDate saledate) {
		this.saledate = saledate;
	}

	@Override
	public String toString() {
		return "Book_SaleDate [id=" + id + ", salepercent=" + salepercent + ", quantity=" + quantity + ", book=" + book
				+ ", saledate=" + saledate + "]";
	}

}
