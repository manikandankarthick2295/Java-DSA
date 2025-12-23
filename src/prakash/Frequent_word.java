package inbox;

import java.util.Arrays;
import java.util.Scanner;

public class Frequent_word {

	public static void main(String[] args) {
		String s = "Java is cool,Java is popular,java language";
		s = s.toLowerCase();
		s = s.replace(",", " ");
		String[] a = s.split(" ");
		int count = 1, max = Integer.MIN_VALUE;
		String ans = "";
		for (int i = 0; i < a.length; i++) {
			count = 1;
			if (a[i].equals(" ")) {
				continue;
			}
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					count++;
					a[j] = " ";
				}
			}
			if (count > max) {
				max = count;
				ans = a[i];
			}
		}
		System.out.println(ans + ":" + max + " times");
	}
}