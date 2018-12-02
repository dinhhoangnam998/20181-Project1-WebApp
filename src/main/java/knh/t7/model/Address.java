package knh.t7.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
	
	@Column(columnDefinition="bit(1) default 0")
	private boolean isPrimary;
	
	@Column(nullable=false)
	private String city;
	
	@Column(nullable=false)
	private String district;
	
	@Column(nullable=false)
	private String street;
	
	@Column(nullable=false)
	private String homenumber;

	@ManyToOne(cascade = CascadeType.ALL)
	private User user;

	public Address() {
		super();
	}

	

	public Address(String city, String district, String street, String homenumber) {
		super();
		this.city = city;
		this.district = district;
		this.street = street;
		this.homenumber = homenumber;
	}



	public Address(boolean isPrimary, String city, String district, String street, String homenumber) {
		super();
		this.isPrimary = isPrimary;
		this.city = city;
		this.district = district;
		this.street = street;
		this.homenumber = homenumber;
	}



	public Address(int id, boolean isPrimary, String city, String district, String street, String homenumber,
			User user) {
		super();
		this.id = id;
		this.isPrimary = isPrimary;
		this.city = city;
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

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getHomenumber() {
		return homenumber;
	}

	public void setHomenumber(String homenumber) {
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
		return "Address [id=" + id + ", isPrimary=" + isPrimary + ", city=" + city + ", district=" + district
				+ ", street=" + street + ", homenumber=" + homenumber + "]";
	}

}
