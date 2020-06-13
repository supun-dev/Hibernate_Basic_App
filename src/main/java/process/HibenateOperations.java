package process;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Student;

public class HibenateOperations {

	public static void insertRecord(Student student) {

		Session session = CommonUtil.getSession();
		Transaction transaction = session.beginTransaction();

		try {
			session.save(student);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		System.out.println(student.toString());
	}

	public static Student getStudent(int indexNo) {
		
		Session session = CommonUtil.getSession();
		Student student = null;
		
		try {
			student = (Student) session.get(Student.class,indexNo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(student.toString());
		
		return student;
	}

}
