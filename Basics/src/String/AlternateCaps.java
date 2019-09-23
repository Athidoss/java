package String;

public class AlternateCaps {
	

	public static void main(String[] args) {
	String s="athidoss";
			char c[]=new char[s.length()];
			char cc[]=c;
			for(int i=0;i<c.length;i++)
			{
				c[i]=s.charAt(i);
			
			}
			
			for(int i=0;i<c.length;i++)
			{
				
					if(!(c[i]>=65 && c[i]<=90))
					{
						c[i]=(char)(c[i]-32);
						System.out.print(c[i]);
						i++;
					}
					
						System.out.print(c[i]);
						
				}
			
			System.out.println();
			
			
			for(int i=0;i<c.length;i++)
			{
				if(i==0)
				{
					if(c[i]==65 || c[i]==97)
					{
						c[i]='@';
						
						
					}
			}
				
			System.out.print(c[i]);
			}
			System.out.println();
			for(int i=0;i<c.length;i++)
			{
				
					if(c[i]==65 || c[i]==97)
					{
						c[i]='@';
					}
					if(c[i]==73 || c[i]==105)
					{
						c[i]='!';
						
					}
					if(c[i]==83 || c[i]==115)
					{
						c[i]='$';
					}
					
			
			System.out.print(c[i]);
			}
			System.out.println();
			
			

	}
		
	}
		


