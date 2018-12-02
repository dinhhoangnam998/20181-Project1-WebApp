package knh.t7.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Original {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(unique = true, nullable = false)
	private String name;
	private Date releasedate;

	@ManyToOne
	private Author author;

	@ManyToMany
	private Set<Category> categories;

	public Original() {
		super();
	}

	public Original(String name, Author author) {
		super();
		this.name = name;
		this.author = author;
	}

	public Original(String name, Author author, Set<Category> categories) {
		super();
		this.name = name;
		this.author = author;
		this.categories = categories;
	}

	public Original(int id, String name, Date releasedate, Author author, Set<Category> categories) {
		super();
		this.id = id;
		this.name = name;
		this.releasedate = releasedate;
		this.author = author;
		this.categories = categories;
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Original [id=" + id + ", name=" + name + ", releasedate=" + releasedate + ", author=" + author
				+ ", categories=" + categories + "]";
	}

}
