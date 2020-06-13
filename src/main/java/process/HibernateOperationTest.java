package process;

import model.Address;
import model.Student;

public class HibernateOperationTest {

	public static void testInsert()
	{
		Address address = new Address();
		address.setUnitName("1103A");
		address.setAddressLine1("Sen Gil Ave, Amorsolo");
		address.setCity("Quezon City");
		address.setZipCode(10500);
		
		
		Student student = new Student();
		student.setIndexNo(783226);
		student.setFirstName("EL");
		student.setFamilyName("Impoluto");
		student.setPresentClass("13M3");
		student.setAddress(address);
		
		HibenateOperations.insertRecord(student);
	}
	
	public static void getStudent()
	{
		int indexNo = 783225;
		HibenateOperations.getStudent(indexNo);
	}
	
}
