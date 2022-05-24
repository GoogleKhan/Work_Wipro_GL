package p1;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 76, 34, 98, 23, 11, 57, 83 };

		System.out.println("Before Sorting " + Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {

			int j = i;

			while (j > 0 && arr[j - 1] > arr[j]) {
				int key = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = key;
				j--;
			}

		}
		System.out.println("After Sorting " + Arrays.toString(arr));
	}

}
