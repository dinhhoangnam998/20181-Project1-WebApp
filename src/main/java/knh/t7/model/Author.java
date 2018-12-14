package knh.t7.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Proxy(lazy = false)
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false, unique = true)
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date birthday;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date deathday;
	
	private String description;
	private String imageurl;

	public Author() {
		super();
	}

	public Author(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public Author(String name, Date birthday, Date deathday, String description, String imageurl) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.deathday = deathday;
		this.description = description;
		this.imageurl = imageurl;
	}

	public Author(int id, String name, Date birthday, Date deathday, String description, String imageurl) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.deathday = deathday;
		this.description = description;
		this.imageurl = imageurl;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getDeathday() {
		return deathday;
	}

	public void setDeathday(Date deathday) {
		this.deathday = deathday;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", birthday=" + birthday + ", deathday=" + deathday
				+ ", description=" + description + ", imageurl=" + imageurl + "]";
	}

}
