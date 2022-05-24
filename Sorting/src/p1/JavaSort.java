package p1;

import java.util.Arrays;

public class JavaSort {

	public static void main(String[] args) {

		int[] arr = { 76, 34, 98, 23, 11, 57, 83 };

		System.out.println("Before Sorting " + Arrays.toString(arr));

		Arrays.sort(arr);
		
		System.out.println("After Sorting " + Arrays.toString(arr));
	}

}
