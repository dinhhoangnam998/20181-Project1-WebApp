//package knh.t7.repository;
//
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import knh.t7.model.Address;
//import knh.t7.model.Author;
//import knh.t7.model.Book;
//import knh.t7.model.BookType;
//import knh.t7.model.Category;
//import knh.t7.model.Order;
//import knh.t7.model.OrderDetail;
//import knh.t7.model.Original;
//import knh.t7.model.Phone;
//import knh.t7.model.Publisher;
//import knh.t7.model.User;
//
//@Repository
//public class InitDbDao {
//
//	@Autowired
//	private SimpleCrudDao crudDao;
//
//	@Autowired
//	SessionFactory factory;
//
//	public void constructData() {
//
//		// not use yet
////		Address addr1 =  new Address(true, "Ha Noi", "Khuong Thuong", "Ton That Tung", "10");
////		Address addr2 = new Address(true, "Ho Chi Minh", "Quan 1", "Le Thanh Tong", "76");
////		Phone phone1 = new Phone("0378653254");
////		Phone phone2 = new Phone("0345318795");
////		Phone phone3 = new Phone("0378653254");
////		Order order1 = new Order(new Date(118, 10, 20));
////		Set<Category> cates2 = new HashSet<>();
////		cates2.add(new Category("Tam Ly"));
////		cates2.add(new Category("Kinh Te"));
////		Set<Author> auths1 = new HashSet<>();
////		Set<Author> auths2 = new HashSet<>();
////		Set<BookType> books1 = new HashSet<>();
////		Set<BookType> books2 = new HashSet<>();
////		Set<Publisher> publisher1 = new HashSet<>();
////		Set<Publisher> publisher2 = new HashSet<>();
//
//		// init categories
//		Category cate1 = new Category("Van Hoc");
//		Category cate2 = new Category("Chinh Tri");
//		Category cate3 = new Category("Giao Duc");
//		Category cate4 = new Category("Thieu Nhi");
//
//		crudDao.create(cate1);
//		crudDao.create(cate2);
//		crudDao.create(cate3);
//		crudDao.create(cate4);
//
//		// init authors
//		Author auth1 = new Author("Masashi Kishimoto");
//		Author auth2 = new Author("Daisuke Furuya");
//		Author auth3 = new Author("Nguyen Nhat Anh");
//		Author auth4 = new Author("J.K. Rowling");
//		Author auth5 = new Author("Gosho Aoyama");
//		Author auth6 = new Author("Takaya Kagami");
//		Author auth7 = new Author("Yamato Yamamoto");
//		Author auth8 = new Author("タカヒロ , 田代哲也");
//
//		crudDao.create(auth1);
//		crudDao.create(auth2);
//		crudDao.create(auth3);
//		crudDao.create(auth4);
//
//		// init book typies
//		BookType bt1 = new BookType("Bia Mem");
//		BookType bt2 = new BookType("Bia Cung");
//		BookType bt3 = new BookType("Tranh Mau");
//		BookType bt4 = new BookType("Boc Vo");
//		crudDao.create(bt1);
//		crudDao.create(bt2);
//		crudDao.create(bt3);
//		crudDao.create(bt4);
//
//		// init publisher
//		Publisher publ1 = new Publisher("NXB KIM DONG");
//		Publisher publ2 = new Publisher("NXB TRE");
//		Publisher publ3 = new Publisher("NXB PHU NU");
//		Publisher publ4 = new Publisher("NXB KHKT");
//		crudDao.create(publ1);
//		crudDao.create(publ2);
//		crudDao.create(publ3);
//		crudDao.create(publ4);
//
//		// init original
//		Set<Category> cates1 = new HashSet<>();
//		cates1.add(new Category("Hanh Dong"));
//		cates1.add(new Category("Manga"));
//		Original orig1 = new Original("Naruto", new Date(108, 4, 6), auth1, cates1);
//
//		// init book
//		Book book1 = new Book("Some describer here", 100, 5, "Tieng Viet", 20, 40, 100, orig1, bt1, publ1);
//
//		// init order detail
//		OrderDetail odd1 = new OrderDetail(1, book1);
//		Set<OrderDetail> odds1 = new HashSet<>();
//		odds1.add(odd1);
//		
//		// init user1
//		Set<Address> addrs1 = new HashSet<>();
//		addrs1.add(new Address(true, "Bac Ninh", "Tu Son", "Nguyen Van Cu", "20"));
//		addrs1.add(new Address(true, "Ha Noi", "Hai Ba Trung", "Tran Dai Nghia", "18"));
//
//		Set<Phone> phones1 = new HashSet<>();
//		phones1.add(new Phone("0348768568"));
//		phones1.add(new Phone("0348789654"));
//
//		Set<Order> orders1 = new HashSet<>();
//		orders1.add(new Order(new Date(), odds1));
//		orders1.add(new Order(new Date(118, 12, 1)));
//
//		User user1 = new User("hoangnam", "mypassword", "Dinh Hoang Nam", new Date(98, 10, 16), 1,
//				"dinhhoangnam998@gmail.com", true, addrs1, phones1, orders1);
//		crudDao.create(user1);
//
//		// init user2
//		Set<Address> addrs2 = new HashSet<>();
//		addrs2.add(new Address(true, "Ha Noi", "Hoang Mai", "Minh Khai", "149"));
//
//		Set<Phone> phones2 = new HashSet<>();
//		phones2.add(new Phone("0982755789"));
//		phones2.add(new Phone("0909153467"));
//
//		Set<Order> orders2 = new HashSet<>();
//		orders2.add(new Order(new Date(107, 11, 30)));
//		orders2.add(new Order(new Date(118, 9, 17)));
//
//		User user2 = new User("myuser", "mypassword", "My Full Name", new Date(100, 11, 18), 1, "myemail@gmail.com",
//				true, addrs2, phones2, orders2);
//
//		crudDao.create(user2);
//
////	
//
//	}
//
//}
