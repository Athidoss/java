package Pattern;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=5;
		for(int i=0;i<5;i++)
		{
			for(int j=m-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=m-i;j>1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
