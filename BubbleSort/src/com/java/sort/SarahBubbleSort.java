package com.java.sort;

import java.util.Arrays;

public class SarahBubbleSort {
	static int[] numbers = new int[5];

	private void randomArray(int arr[]) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 20 + 1);
		}
	}

	private void bubbleSort(int arr[]) {
		int numbers = arr.length;
		for (int i = 0; i <= numbers - 1; i++) {
			for (int j = i + 1; j < numbers; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		SarahBubbleSort sb = new SarahBubbleSort();
		sb.randomArray(numbers);
		System.out.println("Numbers Generated: " + Arrays.toString(numbers));
		sb.bubbleSort(numbers);
		System.out.println("Numbers Sorted: " + Arrays.toString(numbers));
	}
}
