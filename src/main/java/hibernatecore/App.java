package hibernatecore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sf  = new  Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		System.out.println("hello");
		Transaction tx = session.beginTransaction();
		Student s1 = new Student(1, "xyz", "ahmedabad");
		session.save(s1);
		tx.commit();
		session.close();
		sf.close();
	}
}