package BasicsProgram;

import java.util.Scanner;

public class Divison {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the Divident:");
		int Divident=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the Divisor:");
		int Divisor=b.nextInt();
		int Quotient=0;
		while(Divident>=Divisor)
		{
			Divident=Divident-Divisor;
			Quotient++;
		}
		System.out.println("Quotient is="+Quotient);
		System.out.println("Remainder is="+Divident);
		}

}
