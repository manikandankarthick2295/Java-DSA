package inbox;

import java.util.*;

public class rain_water {

	public static void main(String[] args) {
		
		int[]a= {4,5,7,9,2,4,6};
		System.out.println(Arrays.toString(a));
		int left_max[]= new int[a.length];
		left_max[0]=a[0];
		for(int i=1;i<a.length;i++)
		{
			left_max[i]=Math.max(a[i], left_max[i-1]);
		}
		
		int right_max[]=new int[a.length];
		right_max[a.length-1]=a[a.length-1];
		for(int i=a.length-2;i>=0;i--)
		{
			right_max[i]=Math.max(a[i], right_max[i+1]);
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int wl=Math.min(left_max[i], right_max[i]);
			sum=sum+wl-a[i];
		}
		System.out.println(sum);
		
	}

}
