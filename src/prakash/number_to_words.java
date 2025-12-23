package inbox;

import java.util.Scanner;

public class number_to_words {

	// Arrays for number words
	static String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	static String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public static String convertToWords(int num) {
		String result = "";

		if (num == 0)
			return "zero";

		if (num >= 1000) {
			result += ones[num / 1000] + " thousand ";
			num %= 1000;
		}

		if (num >= 100) {
			result += ones[num / 100] + " hundred ";
			num %= 100;
			if (num > 0)
				result += "and ";
		}

		if (num >= 20) {
			result += tens[num / 10] + " ";
			num %= 10;
		}

		if (num > 0) {
			result += ones[num] + " ";
		}

		return result.trim();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number (0 - 9999): ");
		int number = sc.nextInt();

		if (number < 0 || number > 9999) {
			System.out.println("Only supports numbers between 0 and 9999");
		} else {
			String words = convertToWords(number);
			System.out.println("In words: " + words);
		}

	}
}