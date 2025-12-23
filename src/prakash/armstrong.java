package inbox;

import java.util.Scanner;

public class armstrong {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=sc.nextInt();
			int sum=0;
			int temp=n;
			int count=0;
			while (n>0) {
				n/=10;
				count++;
			}
			n=temp;
			for (int i = n; i>0; i/=10) {
				int x=count;
				int num=i%10;
				int ans=1;
				for (int j = 0; j <x; j++) {
					ans=ans*num;
				}
				sum+=ans;
			}
			if (sum==n) {
				System.out.println("arm");
			}
			
	}

}
