package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class GetnNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the num:");
		int n=sc.nextInt();
		for(int i=n; i!=0;)
		//while(n!=0)	
		{
			if(n!=0)
			{
			al.add(n);
			System.out.println("enter the num:");
			n=sc.nextInt();
			}
			else
				break;
		}
		System.out.println("stopped");
		System.out.println(al);
	}

}
