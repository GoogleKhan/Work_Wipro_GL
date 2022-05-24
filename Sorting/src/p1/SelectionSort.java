package p1;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 76, 34, 98, 23, 11, 57, 83 };

		System.out.println("Before Sorting " + Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}

			}

			// Perform Swapping
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

			System.out.println("Sorting for i = " + i + " and  " + Arrays.toString(arr));
		}
		System.out.println("After Sorting " + Arrays.toString(arr));
	}

}
