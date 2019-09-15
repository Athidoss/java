package BasicsProgram;

import java.util.Scanner;

public class DivisibleBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the Min:");
		int Min=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the Max:");
		int Max=b.nextInt();
		for(int i=Min;i<Max;i++)
		{
			if(i%7==0 && i%5!=0)
				System.out.print(i+",");
		}
	}

}
