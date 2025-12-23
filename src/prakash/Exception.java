package inbox;

import java.util.Scanner;

public class Exception {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		if (n<18) {
			throw new InvalidAgeException();
		}else {
			System.out.println("you are eligible");
		}
	}
}
