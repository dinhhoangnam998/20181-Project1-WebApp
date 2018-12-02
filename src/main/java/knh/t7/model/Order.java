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
@Table(name = "Orderx")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(columnDefinition = "datetime default now()")
	private Date orderdate;

	@Column(columnDefinition = "int default 0")
	private int state;

	@ManyToOne
	private User user;

	public Order() {
		super();
	}

	public Order(User user) {
		super();
		this.user = user;
	}


	public Order(User user, Date orderdate, int state) {
		super();
		this.user = user;
		this.orderdate = orderdate;
		this.state = state;
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

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderdate=" + orderdate + ", state=" + state + ", user=" + user + "]";
	}

}
