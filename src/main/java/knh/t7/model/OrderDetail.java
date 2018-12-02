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

	
	@Column(columnDefinition="int unsigned default 1")
	private int quantity;

	@ManyToOne
	private Order order;

	@OneToOne(cascade = CascadeType.ALL)
	private Book book;

	public OrderDetail() {
		super();
	}

	
	public OrderDetail(Order order, Book book, int quantity) {
		super();
		this.order = order;
		this.book = book;
		this.quantity = quantity;
	}


	public OrderDetail(Order order, Book book) {
		super();
		this.order = order;
		this.book = book;
	}




}
