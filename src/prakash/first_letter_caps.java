package inbox;

import java.util.Scanner;

public class first_letter_caps {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String s="i am prakash";
		String[]a=s.split(" ");
		System.out.println(solve(a));
	}
	public static String solve(String[] a)
	{
		String ans="";
//		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			//if (a[i]!=" ") {
				ans+=caps(a[i])+" ";
		//	}
		}
		return ans;
	}
	public static String caps(String s)
	{
		return s.substring(0,1).toUpperCase()+s.substring(1);
	}
}
