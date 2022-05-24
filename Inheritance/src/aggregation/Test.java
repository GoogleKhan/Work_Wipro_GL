package aggregation;

public class Test {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.dogName = "Jacky";

		Employee emp = new Employee();
		emp.name = "John";
		emp.dog = dog;
		
		emp.display();

	}

}
