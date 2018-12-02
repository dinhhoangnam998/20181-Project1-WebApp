package knh.t7.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Orderx")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(columnDefinition="datetime default now()")
	private Date orderdate;
	
	@Column(columnDefinition="int default 0")
	private int state;

	@ManyToOne(cascade = CascadeType.ALL)
	private User user;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private Set<OrderDetail> orderdetails;

	public Order() {
		super();
	}
	
	

	public Order(Date orderdate) {
		super();
		this.orderdate = orderdate;
	}



	public Order(User user) {
		super();
		this.user = user;
	}



	public Order(Date orderdate, User user) {
		super();
		this.orderdate = orderdate;
		this.user = user;
	}
	

	public Order(Date orderdate, Set<OrderDetail> orderdetails) {
		super();
		this.orderdate = orderdate;
		this.orderdetails = orderdetails;
	}



	public Order(int id, Date orderdate, int state, User user, Set<OrderDetail> orderdetails) {
		super();
		this.id = id;
		this.orderdate = orderdate;
		this.state = state;
		this.user = user;
		this.orderdetails = orderdetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<OrderDetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(Set<OrderDetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderdate=" + orderdate + ", state=" + state + ", user=" + user + "]";
	}

}
