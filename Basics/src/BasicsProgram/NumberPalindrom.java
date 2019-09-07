package BasicsProgram;

import java.util.Scanner;

public class NumberPalindrom {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the number"); 
		int a=num.nextInt();
		int sum=0;
		int copy=a;
		while(a>0)
		{
			sum=sum*10+a%10;
			a=a/10;
			
		}
		
		
		if(copy==sum)
		{
			System.out.print(sum);
		}
		else
			System.out.print("not palindrome");

	}

}
