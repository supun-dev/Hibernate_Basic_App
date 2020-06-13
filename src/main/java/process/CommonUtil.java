package process;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Student;

public class CommonUtil {

	public static Session getSession() {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);

		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();

		return session;
	}

}
