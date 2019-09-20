package String;

import java.util.Scanner;

public class NameAscii {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		
		String a= scan.nextLine();
		for(int i=0; i<a.length();i++)
		{
			System.out.println(a.charAt(i)+"---->"+(int)a.charAt(i));
		}
		
		scan.close();
	}

}
