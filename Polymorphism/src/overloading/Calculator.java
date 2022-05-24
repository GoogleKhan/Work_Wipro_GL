package overloading;

public class Calculator {

	int sum(float a, int b) {

		int result = (int) (a + b);

		return result;
	}
	
	int sum(int a, float b) {

		int result = (int) (a + b);

		return result;
	}

	int sum(int x, int y, int z) {

		int result = x + y + z;

		return result;
	}

}
