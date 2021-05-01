package odev2;

public class StudentManager extends UserManager {
	public void add(User user) {	//overriding
		
		System.out.println(user.getFirstname() +" " +user.getLastname()+" " +user.getAge()+ " ozellikte ki ogrenci eklendi");
	
}
}
