package knh.t7.model;

import javax.persistence.CascadeType;
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
	private String summary;
	private String imagesource;
	private int pagenumber;
	private int republish;
	private String isbn;
	private String language;
	private int width;
	private int height;
	private int weight;

	@OneToOne(mappedBy = "book")
	private OrderDetail orderdetail;

	@ManyToOne(cascade = CascadeType.ALL)
	private Original original;

	@ManyToOne(cascade = CascadeType.ALL)
	private BookType booktype;

	@ManyToOne(cascade = CascadeType.ALL)
	private Publisher publisher;

	public Book() {
		super();
	}

	public Book(Original original) {
		super();
		this.original = original;
	}

	public Book(String summary, String imagesource, int pagenumber, int republish, String isbn, String language,
			int width, int height, int weight, OrderDetail orderdetail, Original original, BookType booktype,
			Publisher publisher) {
		super();
		this.summary = summary;
		this.imagesource = imagesource;
		this.pagenumber = pagenumber;
		this.republish = republish;
		this.isbn = isbn;
		this.language = language;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.orderdetail = orderdetail;
		this.original = original;
		this.booktype = booktype;
		this.publisher = publisher;
	}

	public Book(int id, String summary, String imagesource, int pagenumber, int republish, String isbn, String language,
			int width, int height, int weight, OrderDetail orderdetail, Original original, BookType booktype,
			Publisher publisher) {
		super();
		this.id = id;
		this.summary = summary;
		this.imagesource = imagesource;
		this.pagenumber = pagenumber;
		this.republish = republish;
		this.isbn = isbn;
		this.language = language;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.orderdetail = orderdetail;
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getImagesource() {
		return imagesource;
	}

	public void setImagesource(String imagesource) {
		this.imagesource = imagesource;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
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

	public OrderDetail getOrderdetail() {
		return orderdetail;
	}

	public void setOrderdetail(OrderDetail orderdetail) {
		this.orderdetail = orderdetail;
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
		return "Book [id=" + id + ", original=" + original + ", isbn=" + isbn + ", booktype=" + booktype
				+ ", publisher=" + publisher + ", pagenumber=" + pagenumber + ", width=" + width + ", weight=" + weight
				+ ", height=" + height + "]";
	}

}
