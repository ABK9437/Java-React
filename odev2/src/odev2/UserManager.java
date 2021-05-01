package odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstname() +" " +user.getLastname()+" " +user.getAge()+ " eklendi" );
	}
	public void delete(User user) {
		System.out.println(user.getFirstname() +" " +user.getLastname()+" " +user.getAge()+ " silindi" );
	}
	public void update(User user) {
		System.out.println(user.getFirstname() +" " +user.getLastname()+" " +user.getAge()+ " guncellendi" );
	}
}
