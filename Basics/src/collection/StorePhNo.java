package collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class StorePhNo {

	public static void main(String[] args) {
LinkedHashSet<Long> ph=new LinkedHashSet<Long>();
Scanner s = new Scanner(System.in);
System.out.println("Enter the Phone Number:");
Long l=s.nextLong();
while(l!=0)
{
	int m=(int)(l/1000000000);
	if((m>0)&&(m<10))
	{
		ph.add(l);
		System.out.println("Enter the Phone Number:");
		l=s.nextLong();
	}	
		else
		{
		break;	
		}
		
	}
System.out.println(ph);
	
}

	}


