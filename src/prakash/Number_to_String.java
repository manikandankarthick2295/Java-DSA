package inbox;

import java.util.Scanner;

public class Number_to_String{
	static String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	static String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=convert(n);
		System.out.println(s);
	}
	public static String convert(int n) {
		String ans="";
		if (n>=1000) {
			ans+=ones[n/1000]+" "+"thousand"+" ";
			n%=1000;
		}
		if (n>=100) {
			ans+=ones[n/100]+" hundred";
			n%=100;
			if (n>0) {
				ans+=" and ";
			}
		}
		if (n>=20) {
			ans+=tens[n/10]+" ";
			n%=10;
		}
		if (n>0) {
			ans+=ones[n]+" ";
		}
		return ans.trim();
	}
}
