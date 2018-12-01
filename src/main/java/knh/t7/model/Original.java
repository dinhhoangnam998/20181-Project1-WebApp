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
	
	@Column(unique=true)
	private String name;
	private Date date;

	@OneToMany(mappedBy = "original")
	private Set<Book> books;

	@ManyToOne(cascade = CascadeType.ALL)
	private Author author;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Category> categories;

	public Original() {
		super();
	}

	public Original(String name, Date date, Author author) {
		super();
		this.name = name;
		this.date = date;
		this.author = author;
	}

	public Original(int id, String name, Date date, Set<Book> books, Author author, Set<Category> categories) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.books = books;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
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
		return "Original [id=" + id + ", name=" + name + ", date=" + date + ", author=" + author + "]";
	}

}
