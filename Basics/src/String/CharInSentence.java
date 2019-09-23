package String;

public class CharInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India is my country";
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
		c[i]=s.charAt(i);
		}
		
			System.out.print(s.length());
		
	}

}
