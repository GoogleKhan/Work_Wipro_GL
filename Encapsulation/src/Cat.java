
public class Cat {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		// validation code
		if (age <= 0) {
			System.out.println("Are u crazy!!!");
			return;
		}
		this.age = age;
	}

	void display() {
		System.out.println("Age of cat is : " + age);

	}

}
