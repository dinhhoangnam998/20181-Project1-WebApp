package knh.t7.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Creation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false, unique = true)
	private String name;
	private Date releasedate;

	@ManyToOne
	private Category category;

	@ManyToOne
	private Author author;

	public Creation() {
		super();
	}

	public Creation(String name, Category category, Author author) {
		super();
		this.name = name;
		this.category = category;
		this.author = author;
	}

	public Creation(String name, Date releasedate, Category category, Author author) {
		super();
		this.name = name;
		this.releasedate = releasedate;
		this.category = category;
		this.author = author;
	}

	public Creation(int id, String name, Date releasedate, Category category, Author author) {
		super();
		this.id = id;
		this.name = name;
		this.releasedate = releasedate;
		this.category = category;
		this.author = author;
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

	public Date getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Creation [id=" + id + ", name=" + name + ", releasedate=" + releasedate + ", category=" + category
				+ ", author=" + author + "]";
	}

}
