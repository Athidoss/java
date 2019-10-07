package Pattern;

public class RightTri {

	public static void main(String[] args) {
		int n=8;
		
		for(int i=0;i<5;i++)
		{
			for(int j=n-i;j>i;j--)
			{
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
