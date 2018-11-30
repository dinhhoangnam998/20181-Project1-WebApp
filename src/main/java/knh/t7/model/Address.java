package knh.t7.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private boolean isPrimary;
	private String district;
	private String street;
	private int homenumber;

	@ManyToOne(cascade = CascadeType.ALL)
	private User user;

	public Address() {
		super();
	}

	public Address(String district, String street, int homenumber) {
		super();
		this.district = district;
		this.street = street;
		this.homenumber = homenumber;
	}

	public Address(boolean isPrimary, String district, String street, int homenumber) {
		super();
		this.isPrimary = isPrimary;
		this.district = district;
		this.street = street;
		this.homenumber = homenumber;
	}

	public Address(boolean isPrimary, String district, String street, int homenumber, User user) {
		super();
		this.isPrimary = isPrimary;
		this.district = district;
		this.street = street;
		this.homenumber = homenumber;
		this.user = user;
	}

	public Address(int id, boolean isPrimary, String district, String street, int homenumber, User user) {
		super();
		this.id = id;
		this.isPrimary = isPrimary;
		this.district = district;
		this.street = street;
		this.homenumber = homenumber;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPrimary() {
		return isPrimary;
	}

	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHomenumber() {
		return homenumber;
	}

	public void setHomenumber(int homenumber) {
		this.homenumber = homenumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", isPrimary=" + isPrimary + ", district=" + district + ", street=" + street
				+ ", homenumber=" + homenumber + ", user=" + user + "]";
	}

}
