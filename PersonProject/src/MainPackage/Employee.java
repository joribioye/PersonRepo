package MainPackage;

import java.util.Date;

public class Employee extends Person {

	public Employee(String name, String address, String phoneNumber,
			String email) {
		super(name, address, phoneNumber, email);
		
	}
	
	private String office;
	private String salary;
	private Date dateHired = new java.util.Date();
	
	
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}


	@Override
	public String toString() {
		return this.getClass().getName() + getName();
	}

}
