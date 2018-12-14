package knh.t7.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = false)
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(columnDefinition = "datetime default now()")
	private Date billdate;

	@Column(columnDefinition = "int default 0")
	private int state;

	@ManyToOne
	private User user = new User();

	@OneToOne
	private Address address = new Address();

	@OneToOne
	private Phone phone = new Phone();

	public Bill() {
		super();
	}

	public Bill(int userId, int addressId, int phoneId) {
		this();
		this.user.setId(userId);
		this.address.setId(addressId);
		this.phone.setId(phoneId);
	}

	public Bill(Date billdate, int state, int userId, int addressId, int phoneId) {
		this();
		this.billdate = billdate;
		this.state = state;
		this.user.setId(userId);
		this.address.setId(addressId);
		this.phone.setId(phoneId);
	}

	public Bill(User user, Address address, Phone phone) {
		super();
		this.user = user;
		this.address = address;
		this.phone = phone;
	}

	public Bill(Date billdate, int state, User user, Address address, Phone phone) {
		super();
		this.billdate = billdate;
		this.state = state;
		this.user = user;
		this.address = address;
		this.phone = phone;
	}

	public Bill(int id, Date billdate, int state, User user, Address address, Phone phone) {
		super();
		this.id = id;
		this.billdate = billdate;
		this.state = state;
		this.user = user;
		this.address = address;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBilldate() {
		return billdate;
	}

	public void setBilldate(Date billdate) {
		this.billdate = billdate;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", billdate=" + billdate + ", state=" + state + ", user=" + user + ", address="
				+ address + ", phone=" + phone + "]";
	}

}
