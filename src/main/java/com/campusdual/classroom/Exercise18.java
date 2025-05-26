package com.campusdual.classroom;


public class Exercise18 {

	public static void main(String[] args) {
		showInlineArray(createAndInitializeArray(5));
	}

	public static int[] createAndInitializeArray(int index) {
		int num = 1;
		int[] arraySample = new int[index];
		for (int i = 0; i < index; i++) {
			arraySample[i] = num;
			num++;
		}
		return arraySample;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
	}
}
