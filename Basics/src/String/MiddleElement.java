package String;

import java.util.Scanner;

public class MiddleElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String input=s.nextLine();
		
		int i=input.length();
		if(i%2!=0)
		{
			System.out.print(input.charAt(i/2-1));
		System.out.print(input.charAt(i/2));
		System.out.print(input.charAt(i/2+1));
		}
	}

}
