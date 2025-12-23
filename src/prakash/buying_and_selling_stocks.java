package inbox;

import java.util.Arrays;
import java.util.Scanner;

public class buying_and_selling_stocks {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int []a= {4,6,8,3,4,7,9};
		int max_profit=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int profit=a[j]-a[i];
				if (profit>max_profit) {
					max_profit=profit;
				}
			}
		}
		System.out.println(max_profit);
	}

}
