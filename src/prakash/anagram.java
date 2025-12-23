package inbox;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class anagram {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s1="earth";
		String s2="heart";
		if (anagram(s1,s2)) {
			System.out.println("anagram");
		}
		System.out.println();
	}
	public static char[] sort(String s)
	{
		char[]a=s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]) {
					char temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	public static boolean anagram(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		s1=s1.trim();
		s2=s2.trim();
		char[]sort1=sort(s1);
		char[]sort2=sort(s2);
		return Arrays.equals(sort1,sort2);
		
	}
}
