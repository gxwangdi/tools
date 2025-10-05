package com.company;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		int[] test = { 0, 1, 2, -3, 4, -5, 100, 7 };
		System.out.println(solve(test));
	}

	public static String solve(int[] array) {
		String[] seasons = { "WINTER", "SPRING", "SUMMER", "AUTUMN" };
		List<int[]> list = new ArrayList<>();
		// for (int i = 0; i < 4; i++) {
		// int[] a = { Integer.MAX_VALUE, Integer.MIN_VALUE }; // {min, max}
		// list.add(a);
		// }
		int[] a1 = { Integer.MAX_VALUE, Integer.MIN_VALUE };
		int[] a2 = { Integer.MAX_VALUE, Integer.MIN_VALUE };
		int[] a3 = { Integer.MAX_VALUE, Integer.MIN_VALUE };
		int[] a4 = { Integer.MAX_VALUE, Integer.MIN_VALUE };
		final int size = array.length;
		for (int i = 0; i < size; i++) {
			if (i < (size / 4)) {
				// if (array[i] > list.get(0)[1]) {
				// list.get(0)[1] = array[i];
				// }
				// if (array[i] < list.get(0)[0]) {
				// list.get(0)[0] = array[i];
				// }
				if (array[i] > a1[1]) {
					a1[1] = array[i];
				}
				if (array[i] < a1[0]) {
					a1[0] = array[i];
				}
				continue;
			}
			if (i < (size / 2)) {
				// if (array[i] > list.get(1)[1]) {
				// list.get(0)[1] = array[i];
				// }
				// if (array[i] < list.get(1)[0]) {
				// list.get(0)[0] = array[i];
				// }
				if (array[i] > a2[1]) {
					a2[1] = array[i];
				}
				if (array[i] < a2[0]) {
					a2[0] = array[i];
				}
				continue;
			}
			if (i < (size / 4 * 3)) {
				// if (array[i] > list.get(2)[1]) {
				// list.get(0)[1] = array[i];
				// }
				// if (array[i] < list.get(2)[0]) {
				// list.get(0)[0] = array[i];
				// }
				if (array[i] > a3[1]) {
					a3[1] = array[i];
				}
				if (array[i] < a3[0]) {
					a3[0] = array[i];
				}
				continue;
			}
			// i < n
			// if (array[i] > list.get(3)[1]) {
			// list.get(0)[1] = array[i];
			// }
			// if (array[i] < list.get(3)[0]) {
			// list.get(0)[0] = array[i];
			// }
			if (array[i] > a4[1]) {
				a4[1] = array[i];
			}
			if (array[i] < a4[0]) {
				a4[0] = array[i];
			}
		}
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		int diff = a1[1] - a1[0];
		int res = 0;
		for (int i = 1; i < list.size(); i++) {
			int temp = list.get(i)[1] - list.get(i)[0];
			if (temp > diff) {
				diff = temp;
				res = i;
			}
		}
		return seasons[res];
	}
}
