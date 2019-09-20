package String;

public class ReplaceAISS {

	

	public static void main(String[] args) {
		String s="athidoss";
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.charAt(i);
		
		}
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


	}

}
