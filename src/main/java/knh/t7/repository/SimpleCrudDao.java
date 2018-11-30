package knh.t7.repository;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SimpleCrudDao {

	@Autowired
	public SessionFactory factory;
	
	// create
		public <T> void create(T t) {
			Session session = factory.openSession();
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				session.save(t);
				tx.commit();
				System.out.println("    -->create 	" + t.toString() + " 	<--");
			} catch (Exception e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		}

		// read
		public Object read(Class clazz, Serializable id) {
			Session session = factory.openSession();
			Transaction tx = null;
			Object obj = new Object();
			try {
				tx = session.beginTransaction();
				tx.commit();
				obj = session.get(clazz, id);
			} catch (Exception e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
			return obj;
		}

		// update
		public <T> void update(T t) {
			Session session = factory.openSession();
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				session.update(t);
				tx.commit();
				System.out.println("    -->update 	" + t.toString() + " 	<--");
			} catch (Exception e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		}

		// delete
		public <T> void delete(T t) {
			Session session = factory.openSession();
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				session.delete(t);
				tx.commit();
				System.out.println("    -->delete 	" + t.toString() + " 	<--");
			} catch (Exception e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		}
		
		public void closeFactory() {
			factory.close();
		}
}
