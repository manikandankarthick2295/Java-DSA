package inbox;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class merge_zigzag_array {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		int[]b= {5,6,7,8};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int[]res=new int[a.length+b.length];
		for(int i=0 ,m=0,n=0;i<res.length;i++)
		{
			if(i%2==0)
			{
				res[i]=a[m++];
			}
			else
				res[i]=b[n++];
		}
		System.out.println(Arrays.toString(res));
		
	}

}
