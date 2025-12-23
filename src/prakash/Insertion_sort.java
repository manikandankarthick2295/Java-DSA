package inbox;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Insertion_sort {
	public static void main(String[] args) {
		int[] a = { 50, 40, 30, 20, 10 };
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int curr = a[i];
			int prev = i - 1;
			while (prev >= 0 && a[prev] > curr) {
				a[prev + 1] = a[prev];
				prev--;
			}
			a[prev + 1] = curr;
		}
		System.out.println(Arrays.toString(a));
	}
}
