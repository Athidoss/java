package String;

public class PrinttheString {

	public static void main(String[] args) {
		String s="world";
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.charAt(i);
			System.out.println(c[i]);
		}
		

	}

}
