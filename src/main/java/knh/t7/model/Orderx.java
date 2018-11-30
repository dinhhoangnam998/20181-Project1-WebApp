package knh.t7.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Orderx {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Date date;
	private int state;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	
	@OneToMany(mappedBy="orderx")
	private Set<OrderDetail> orderdetails;

	public Orderx() {
		super();
	}

	
	
	public Orderx(Date date, User user) {
		super();
		this.date = date;
		this.user = user;
	}



	public Orderx(Date date, int state, User user) {
		super();
		this.date = date;
		this.state = state;
		this.user = user;
	}



	public Orderx(int id, Date date, int state, User user, Set<OrderDetail> orderdetails) {
		super();
		this.id = id;
		this.date = date;
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



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
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
		return "Orderx [id=" + id + ", date=" + date + ", state=" + state + ", user=" + user + "]";
	}
	
	
	
}
