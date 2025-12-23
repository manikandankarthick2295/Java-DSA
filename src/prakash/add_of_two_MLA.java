package inbox;

public class add_of_two_MLA {
	public static void main(String[] args) {

		int[][]a= {
				{1,2,3},
				{4,5,6}
		};
		int[][]b= {
				{1,2,3},
				{4,5,6}
		};
		int rows=a.length;
		int cols=a[0].length;
		int[][]res=new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
