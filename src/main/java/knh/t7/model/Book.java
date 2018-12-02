package knh.t7.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(columnDefinition = "varchar(511) default 'no describe'")
	private String describe;

	@Column(nullable = false)
	private String language;

	@Column(nullable = false)
	private int pagenumber;
	private int republish;
	private String isbn;
	private int width;
	private int height;
	private int weight;

	@ManyToOne
	private Original original;

	@ManyToOne
	private BookType booktype;

	@ManyToOne
	private Publisher publisher;

	public Book() {
		super();
	}

	

	public Book(Original original, BookType booktype, Publisher publisher, String describe, String language,
			int pagenumber) {
		super();
		this.original = original;
		this.booktype = booktype;
		this.publisher = publisher;
		this.describe = describe;
		this.language = language;
		this.pagenumber = pagenumber;
	}



	public Book(Original original, BookType booktype, Publisher publisher, String describe, String language,
			int pagenumber, int republish, String isbn, int width, int height, int weight) {
		super();
		this.original = original;
		this.booktype = booktype;
		this.publisher = publisher;
		this.describe = describe;
		this.language = language;
		this.pagenumber = pagenumber;
		this.republish = republish;
		this.isbn = isbn;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}



	public Book(int id, String describe, String language, int pagenumber, int republish, String isbn, int width,
			int height, int weight, Original original, BookType booktype, Publisher publisher) {
		super();
		this.id = id;
		this.describe = describe;
		this.language = language;
		this.pagenumber = pagenumber;
		this.republish = republish;
		this.isbn = isbn;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.original = original;
		this.booktype = booktype;
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getPagenumber() {
		return pagenumber;
	}

	public void setPagenumber(int pagenumber) {
		this.pagenumber = pagenumber;
	}

	public int getRepublish() {
		return republish;
	}

	public void setRepublish(int republish) {
		this.republish = republish;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Original getOriginal() {
		return original;
	}

	public void setOriginal(Original original) {
		this.original = original;
	}

	public BookType getBooktype() {
		return booktype;
	}

	public void setBooktype(BookType booktype) {
		this.booktype = booktype;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", describe=" + describe + ", original=" + original + ", publisher=" + publisher
				+ "]";
	}

}
