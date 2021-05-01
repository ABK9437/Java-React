package odev2;

public class Student extends User{
	private String adres;
	

	public Student(int id, String firstname, String lastname, String email, int age, String adres) {
		super(id, firstname, lastname, email, age);
		this.adres = adres;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	
	
	
	
	
}
