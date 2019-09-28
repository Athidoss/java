package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraryListToArray {
	public static void main(String[] args){
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		Integer a[]=new Integer[al.size()];
		while(true)
		{
			
			if(n!=0)
			{
				al.add(n);
		
        System.out.println("Enter the number:");
		n=s.nextInt();
		
		
			}
			else
				break;
			
		}
		System.out.println(al);
		
		a=al.toArray(a);
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
		
		
	}
	
	}
