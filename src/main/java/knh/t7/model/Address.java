package knh.t7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = false)
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private String address;

	@ManyToOne
	private User user = new User();

	public Address() {
		super();
	}
	
	public Address(String address, int userId) {
		this();
		this.address = address;
		this.user.setId(userId);
	}

	public Address(String address, User user) {
		super();
		this.address = address;
		this.user = user;
	}

	public Address(int id, String address, User user) {
		super();
		this.id = id;
		this.address = address;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", user=" + user + "]";
	}

}
