package inbox;

import java.util.Arrays;

public class product_array_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,4};
		int[]pre=new int[a.length];
		pre[0]=1;
		for (int i = 1; i < pre.length; i++) {
			pre[i]=pre[i-1]*a[i-1];
		}
		int[]post=new int[a.length];
		post[post.length-1]=1;
		for (int i = a.length-2; i >=0; i--) {
			post[i]=post[i+1]*a[i+1];
		}
		int[]res=new int[a.length];
		for (int i = 0,m=0; i < a.length; i++) {
			res[m++]=post[i]*pre[i];
		}
		System.out.println(Arrays.toString(res));
	}

}
