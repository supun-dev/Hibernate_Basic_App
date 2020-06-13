package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_main")
public class Student {

	@Column(name = "index_no")
	@Id
	private int indexNo;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "family_name")
	private String familyName;

	@Column(name = "present_class")
	private String presentClass;

	private Address address;

	public int getIndexNo() {
		return indexNo;
	}

	public void setIndexNo(int indexNo) {
		this.indexNo = indexNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getPresentClass() {
		return presentClass;
	}

	public void setPresentClass(String presentClass) {
		this.presentClass = presentClass;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [indexNo=" + indexNo + ", firstName=" + firstName + ", familyName=" + familyName
				+ ", presentClass=" + presentClass + ", address=" 
				+ address.getUnitName() + "," + address.getAddressLine1() + "," + address.getCity() + "," + address.getZipCode() +"]";
	}

	

}
