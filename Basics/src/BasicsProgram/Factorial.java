package BasicsProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int e=obj.nextInt();
		int fact=1;
		for(int i=1;i<=e;i++)
		{
			fact=fact*i;
		}
		System.out.print(fact);
	}
	

}
