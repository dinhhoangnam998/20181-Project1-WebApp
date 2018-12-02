package knh.t7.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(unique = true, nullable = false)
	private String name;
	private String city;
	private String district;
	private String street;
	private String homenumber;

	public Publisher() {
		super();
	}

	public Publisher(String name) {
		super();
		this.name = name;
	}

	public Publisher(String name, String city, String district, String street, String homenumber) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.street = street;
		this.homenumber = homenumber;
	}

	public Publisher(int id, String name, String city, String district, String street, String homenumber) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.district = district;
		this.street = street;
		this.homenumber = homenumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", city=" + city + ", district=" + district + ", street="
				+ street + ", homenumber=" + homenumber + "]";
	}

}
