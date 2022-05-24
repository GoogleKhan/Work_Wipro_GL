package p1;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		System.out.println("Enter a number which u  wants to search");

		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();

		int index = searchElement(target);

		System.out.println("The element " + target + " found at index = " + index);

	}

	private static int searchElement(int target) {

		int[] arr = { 5, 2, 98, 53, 18, 73 };

		int indexFound = -1;

		for (int i = 0; i < arr.length; i++) {

			int current = arr[i];

			if (current == target) {
				indexFound = i;
			}

		}
		return indexFound;
	}

}
