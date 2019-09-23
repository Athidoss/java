package String;

import java.util.Scanner;

public class FirstansLastUpperCase {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.print("Enter the string:");
	String e=a.nextLine();
	e=e.substring(0,1).toUpperCase()+e.substring(1,e.length()-1)+e.substring(e.length()-1).toUpperCase();
	System.out.print(e);
	}

}
