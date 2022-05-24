package p1;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		System.out.println("Enter a number which u  wants to search");

		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();

		int[] arr = { 3, 13, 23, 45, 61, 77, 88, 91, 101 };

		int index = binarySearch(arr, target);

		System.out.println("The element " + target + " found at index = " + index);

	}

	private static int binarySearch(int[] arr, int target) {

		int minIndex = 0;
		int maxIndex = arr.length - 1;

		while (minIndex <= maxIndex) {

			int midIndex = (maxIndex - minIndex) / 2;

			if (target == arr[midIndex]) {
				return midIndex;
			} else if (target > arr[midIndex]) {

				minIndex = maxIndex + 1;

			} else if (target < arr[midIndex]) {
				maxIndex = midIndex - 1;
			}
		}

		return -1;
	}

}
