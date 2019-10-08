package StringArray;

public class ReverseWords {

	public static void main(String[] args) {
	
		String s="India is my country";
		String e[]=s.split(" ");
		for(int i=e.length-1;i>=0;i--)
		{
			System.out.print(e[i]);
		}
	}

}
