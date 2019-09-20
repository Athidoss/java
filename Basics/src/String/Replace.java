package String;

public class Replace {

	public static void main(String[] args) {
		String s="athidoss";
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.charAt(i);
		
		}
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

	}

}
