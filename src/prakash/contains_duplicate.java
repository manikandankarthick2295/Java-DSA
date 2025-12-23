package inbox;

public class contains_duplicate {

	public static void main(String[] args) {
		int a[]= {2,3,6,4,2};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(true);
					break;
				}
			}
		}
	}

}
