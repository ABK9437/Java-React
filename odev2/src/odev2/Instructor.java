package odev2;

public class Instructor extends User{
	private double evaluation;

	public Instructor(int id, String firstname, String lastname, String email, int age, double evaluation) {
		super(id, firstname, lastname, email, age);
		this.evaluation = evaluation;
	}

	public double getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(double evaluation) {
		this.evaluation = evaluation;
	}

	
	
	
}
