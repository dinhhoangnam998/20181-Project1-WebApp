package knh.t7.model;

import java.util.Date;
import java.util.Set;

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
	
	@Column(unique=true, nullable=false)
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private String fullname;
	private Date birthday;
	private int gender;
	
	@Column(nullable=false)
	private String email;
	
	@Column(columnDefinition="default 1")
	private boolean state;

	@OneToMany(mappedBy = "user")
	private Set<Address> addresses;

	@OneToMany(mappedBy = "user")
	private Set<Phone> phones;

	@OneToMany(mappedBy = "user")
	private Set<Order> orders;

	public User() {
		super();
	}

	
	// just for test
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public User(String username, String password, String fullname, String email, boolean state) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.state = state;
	}

	public User(String username, String password, String fullname, Date birthday, int gender, String email,
			boolean state, Set<Address> addresses, Set<Phone> phones) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
		this.state = state;
		this.addresses = addresses;
		this.phones = phones;
	}

	public User(String username, String password, String fullname, String email, Set<Address> addresses,
			Set<Phone> phones, Set<Order> orders) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.addresses = addresses;
		this.phones = phones;
		this.orders = orders;
	}

	public User(int id, String username, String password, String fullname, Date birthday, int gender, String email,
			boolean state, Set<Address> addresses, Set<Phone> phones, Set<Order> orders) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
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

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
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
		return "User [id=" + id + ", username=" + username + ", fullname=" + fullname + ", birthday=" + birthday
				+ ", state=" + state + "]";
	}

}
