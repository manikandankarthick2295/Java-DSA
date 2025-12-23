package inbox;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class merge_array {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		int[]b= {5,6,7,8};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int[]res=new int[a.length+b.length];
		int n=0;
		for (int i = 0,m=0; i < res.length; i++) {
			if(m<a.length)
			{
				res[m++]=a[i];
			}
	
			else if(n<b.length) {
				
			res[m++]=b[n++];
			}
		}
		System.out.println(Arrays.toString(res));
		
	}

}
