
public class Test {

	public static void main(String[] args) {

		Car car = new Car();
		car.setBrand("Tata");

		Engine engine = new Engine();
		car.setEngine(engine);

		car.start();

	}

}
