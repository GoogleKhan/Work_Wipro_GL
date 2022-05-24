package p1;

public class Student {

	String name;
	int rollNum;

	// Default Constructor
	public Student() {
		name = "Tushar";
		rollNum = 207;
	}

	// Parameterized
	public Student(String name, int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}

	void display() {

		System.out.println("Hello " + name + " your roll number is " + rollNum);
	}

}
