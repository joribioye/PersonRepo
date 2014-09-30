package MainPackage;

public class Faculty extends Employee{
	
	private String officeHours;
	private String rank;

	public Faculty(String name, String address, String phoneNumber, String email) {
		super(name, address, phoneNumber, email);
		// TODO Auto-generated constructor stub
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		
		return this.getClass().getName() + getName();
	}

}