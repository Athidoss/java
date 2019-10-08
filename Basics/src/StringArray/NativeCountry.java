package StringArray;

import java.util.Scanner;

public class NativeCountry {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your country:");
		String s=scan.next();
		s=s.toLowerCase();
		String a[]={"Tamilnadu","Kerala","Andra","Karnataka"};
		String b[]={"California","Texas","Arizona","Newyork"};
		switch(s)
		{
		case "india":
			
		for(int i=0;i<a.length;i++)	
			System.out.println(a[i]);
		break;
		case "usa":
		
		for(int i=0;i<b.length;i++)	
			System.out.println(b[i]);
		break;
		default :
			System.out.print("This are the places in that country");
		}
		
	}

}
