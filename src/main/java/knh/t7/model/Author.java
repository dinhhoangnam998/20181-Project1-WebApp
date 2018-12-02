package knh.t7.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(unique = true, nullable = false)
	private String name;
	private Date birthday;
	private String describe;

	public Author() {
		super();
	}

	public Author(String name) {
		super();
		this.name = name;
	}

	public Author(String name, Date birthday, String describe) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.describe = describe;
	}

	public Author(int id, String name, Date birthday, String describe) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.describe = describe;
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

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}

}
