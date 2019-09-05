package BasicsProgram;

import java.util.Scanner;

public class SumOfnNo {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the natural number:");
		int a=obj.nextInt();
		int sum=0;
for(int i=0;i<=a;i++)
{
	sum=sum+i;
	
}
System.out.print(sum);
	}



	

}
