package odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor instructor = new Instructor(1, "Asude", "Busra", "asude@gmail.com", 30, 5/10);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.update(instructor);
		instructorManager.delete(instructor);
		System.out.println("--------------------------------------");
		
		
		Student student1 = new Student(2, "Ali ", "Veli", "aliveli00@gmail.com", 20, "İstanbul" );
		Student student2 = new Student(3, "Furkan ", "Ayse", "furkanayse@gmail.com", 23, "Türkiye");
		

		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student1);
		studentManager.update(student1);
		studentManager.delete(student1);
		System.out.println("--------------------------------------");
		studentManager.add(student2);
		studentManager.update(student2);
		studentManager.delete(student2);
	}

}
