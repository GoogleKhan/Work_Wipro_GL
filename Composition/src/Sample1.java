
public class Sample1 {

	public static void main(String[] args) {

		System.out.println(squareIt(4));
		System.out.println(squareItNew(4));

	}

	static int squareIt(int n) {
		int output = 0;

		for (int i = 1; i <= n; i++) {
			output = output + n;
		}
		return output;
	}

	static int squareItNew(int n) {

		return n * n;
	}

}
