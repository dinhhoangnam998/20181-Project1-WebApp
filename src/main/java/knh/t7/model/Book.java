package knh.t7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = false)
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(columnDefinition = "varchar(511) default 'no descripton'")
	private String description;

	@Column(nullable = false)
	private String language;

	@Column(nullable = false, columnDefinition = "int unsigned")
	private int pagenumber;

	@Column(columnDefinition = "int unsigned")
	private int republishno;

	private String isbn;

	@Column(columnDefinition = "int unsigned")
	private int width;

	@Column(columnDefinition = "int unsigned")
	private int height;

	private int weight;

	@Column(nullable = false, columnDefinition = "int unsigned")
	private int coverprice;

	private String imageurl;

	@ManyToOne
	private Creation creation = new Creation();

	@ManyToOne
	private Type type = new Type();

	@ManyToOne
	private Publisher publisher = new Publisher();

	public Book() {
		super();
	}
	
	public Book(String language, int pagenumber, int republishno, int coverprice, int creationId, int typeId,
			int publisherId) {
		this();
		this.language = language;
		this.pagenumber = pagenumber;
		this.republishno = republishno;
		this.coverprice = coverprice;
		this.creation.setId(creationId);
		this.type.setId(typeId);
		this.publisher.setId(publisherId);
	}

	public Book(String language, int pagenumber, int republishno, int coverprice, Creation creation, Type type,
			Publisher publisher) {
		this();
		this.language = language;
		this.pagenumber = pagenumber;
		this.republishno = republishno;
		this.coverprice = coverprice;
		this.creation = creation;
		this.type = type;
		this.publisher = publisher;
	}

	public Book(int id, String description, String language, int pagenumber, int republishno, String isbn, int width,
			int height, int weight, int coverprice, String imageurl, Creation creation, Type type,
			Publisher publisher) {
		super();
		this.id = id;
		this.description = description;
		this.language = language;
		this.pagenumber = pagenumber;
		this.republishno = republishno;
		this.isbn = isbn;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.coverprice = coverprice;
		this.imageurl = imageurl;
		this.creation = creation;
		this.type = type;
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public int getRepublishno() {
		return republishno;
	}

	public void setRepublishno(int republishno) {
		this.republishno = republishno;
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

	public int getCoverprice() {
		return coverprice;
	}

	public void setCoverprice(int coverprice) {
		this.coverprice = coverprice;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public Creation getCreation() {
		return creation;
	}

	public void setCreation(Creation creation) {
		this.creation = creation;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", description=" + description + ", language=" + language + ", pagenumber="
				+ pagenumber + ", republishno=" + republishno + ", isbn=" + isbn + ", width=" + width + ", height="
				+ height + ", weight=" + weight + ", coverprice=" + coverprice + ", imageurl=" + imageurl
				+ ", creation=" + creation + ", type=" + type + ", publisher=" + publisher + "]";
	}

}
