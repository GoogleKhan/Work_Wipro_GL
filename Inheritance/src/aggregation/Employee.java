package aggregation;

public class Employee extends Person {

	String name;

	Dog dog;

	void display() {
		sleep();
		System.out.println("Your name is " + name + "  and your Dog name is " + dog.dogName);

	}

}
