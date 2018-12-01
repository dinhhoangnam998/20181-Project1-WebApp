package knh.t7.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	
	@Column(columnDefinition="default 1")
	private int amount;

	@ManyToOne(cascade = CascadeType.ALL)
	private Order order;

	@OneToOne(cascade = CascadeType.ALL)
	private Book book;

	public OrderDetail() {
		super();
	}

	public OrderDetail(int amount, Order order, Book book) {
		super();
		this.amount = amount;
		this.order = order;
		this.book = book;
	}

	public OrderDetail(int id, int amount, Order order, Book book) {
		super();
		this.id = id;
		this.amount = amount;
		this.order = order;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Order getOrderx() {
		return order;
	}

	public void setOrderx(Order order) {
		this.order = order;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", amount=" + amount + ", orderx=" + order + ", book=" + book + "]";
	}

}
