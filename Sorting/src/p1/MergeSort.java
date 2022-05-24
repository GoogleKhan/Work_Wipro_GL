package p1;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 76, 34, 98, 23, 11, 57, 83 };

		System.out.println("Before Sorting " + Arrays.toString(arr));

		mergeSort(arr, 0, arr.length - 1);

		System.out.println("After Sorting " + Arrays.toString(arr));
	}

	public static void mergeSort(int[] arrToSort, int startIndex, int endIndex) {

		if (startIndex >= endIndex) {
			return;
		}

		int midIndex = startIndex + (endIndex - startIndex) / 2;

		// Divide
		mergeSort(arrToSort, startIndex, midIndex); // Left sub array
		mergeSort(arrToSort, midIndex + 1, endIndex); // Right sub array

		// Conquer
		merge(arrToSort, startIndex, midIndex, endIndex);

	}

	public static void merge(int[] arrToSort, int startIndex, int midIndex, int endIndex) {

		int[] leftArr = new int[midIndex - startIndex + 1];
		int[] rightArr = new int[endIndex - midIndex];

		for (int i = 0; i < leftArr.length; i++) {
			leftArr[i] = arrToSort[startIndex + i];
		}

		for (int i = 0; i < rightArr.length; i++) {
			rightArr[i] = arrToSort[midIndex + i + 1];
		}

		// merging the left and right arrays into a single sorted array.

		int leftArrIdx = 0;
		int rightArrIdx = 0;
		int sortedArrIdx = startIndex;

		while ((leftArrIdx < leftArr.length) && (rightArrIdx < rightArr.length)) {

			if (leftArr[leftArrIdx] < rightArr[rightArrIdx]) {
				arrToSort[sortedArrIdx] = leftArr[leftArrIdx];
				leftArrIdx++;
			} else {
				arrToSort[sortedArrIdx] = rightArr[rightArrIdx];
				rightArrIdx++;
			}
			sortedArrIdx++;
		}
		
		//adding the rest of the elements of the left array if present
		while(leftArrIdx < leftArr.length) {
			arrToSort[sortedArrIdx]= leftArr[leftArrIdx];
			leftArrIdx++;
			sortedArrIdx++;
		}
		
		//adding the rest of the elements of the right array if present
		while(rightArrIdx < rightArr.length) {
			arrToSort[sortedArrIdx]= rightArr[rightArrIdx];
			rightArrIdx++;
			sortedArrIdx++;
		}

	}

}
