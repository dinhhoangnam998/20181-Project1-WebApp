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

	@Column(columnDefinition = "int default 0")
	private int isprimary;

	@Column(nullable = false)
	private String city;

	@Column(nullable = false)
	private String district;

	@Column(nullable = false)
	private String street;

	@Column(nullable = false)
	private String homenumber;

	@ManyToOne
	private User user;

	public Address() {
		super();
	}

	public Address(User user, String city, String district, String street, String homenumber) {
		super();
		this.user = user;
		this.city = city;
		this.district = district;
		this.street = street;
		this.homenumber = homenumber;
	}

	public Address(int id, int isprimary, String city, String district, String street, String homenumber, User user) {
		super();
		this.id = id;
		this.isprimary = isprimary;
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

	public int getIsprimary() {
		return isprimary;
	}

	public void setIsprimary(int isprimary) {
		this.isprimary = isprimary;
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
		return "Address [user=" + user + ", id=" + id + ", isprimary=" + isprimary + ", city=" + city + ", district="
				+ district + ", street=" + street + ", homenumber=" + homenumber + "]";
	}
	
	

}
