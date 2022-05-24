package p1;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 76, 34, 98, 23, 11, 57, 83 };

		System.out.println("Before Sorting " + Arrays.toString(arr));

		for (int k = 0; k < arr.length - 1; k++) {

			for (int i = 0; i < arr.length - 1; i++) {
				int currentElement = arr[i];
				int nextElement = arr[i + 1];

				if (currentElement > nextElement) {

					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}
			}
		}
		System.out.println("After Sorting " + Arrays.toString(arr));
	}

}
