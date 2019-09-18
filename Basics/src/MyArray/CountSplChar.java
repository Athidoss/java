package MyArray;

import java.util.Scanner;

public class CountSplChar {

	public static void main(String[] args) {
		
		int count=0;
		char a[]={'a','b','c','d','e','f','g','h','/','*','-','!','#','%','A'};
		for(int i=0;i<a.length;i++)
		{
		
			if(!((a[i]>=65)&&(a[i]<=90)||(a[i]>=97)&&(a[i]<=122)))
		
			
			{
				count++;
			}
		
		
		
	}
		System.out.println(count+"spl char out of"+a.length);
	}

	

}
