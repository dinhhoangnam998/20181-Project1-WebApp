package knh.t7.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(unique = true, nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String fullname;

	private int gender;
	private Date birthday;

	@Column(columnDefinition = "int default 1")
	private int state;

	public User() {
		super();
	}

	public User(String username, String password, String email, String fullname) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.fullname = fullname;
	}

	public User(String username, String password, String email, String fullname, int gender, Date birthday, int state) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.fullname = fullname;
		this.gender = gender;
		this.birthday = birthday;
		this.state = state;
	}

	public User(int id, String username, String password, String email, String fullname, int gender, Date birthday,
			int state, Set<Address> addresses, Set<Phone> phones, Set<Order> orders) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.fullname = fullname;
		this.gender = gender;
		this.birthday = birthday;
		this.state = state;
		this.addresses = addresses;
		this.phones = phones;
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", fullname=" + fullname + ", gender="
				+ gender + ", state=" + state + "]";
	}

	// just for query, don't touch it
	@OneToMany(mappedBy = "user")
	private Set<Address> addresses;

	@OneToMany(mappedBy = "user")
	private Set<Phone> phones;

	@OneToMany(mappedBy = "user")
	private Set<Order> orders;

}
