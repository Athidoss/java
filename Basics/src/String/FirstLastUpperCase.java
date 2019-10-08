package String;

public class FirstLastUpperCase {

	public static void main(String[] args) {
		String s="aadhi";
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0;i<c.length;i++)
		{
			if(i==0||i==c.length-1)
			{
				if(!(c[i]>=65 && c[i]<=90))
				{
					System.out.print((char)(c[i]-32));
				}
				else
				{
				
			System.out.print(c[i]);
			}}
				else
				{
					System.out.print(c[i]);
				}
			}
			
			
		}

	}


