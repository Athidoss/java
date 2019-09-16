package String;

public class FirstandLastUppercase {

	public static void main(String[] args) {
		String s="aadhi";
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.charAt(i);
		
		}
		for(int i=0;i<c.length;i++)
		{
			if(i==0)
			{
				if(!(c[0]>=65 && c[0]<=90))
				{
					c[i]=(char)(c[i]-32);
				}
				if(i==c.length-1)
				{
					if(!(c[c.length-1]>=65 && c[c.length-1]<=90))
					{
						c[i]=(char)(c[c.length-1]-32);
					
					}
					
				}
				
			}
			System.out.print(c[i]);
			
		}
			
	

	}

}
