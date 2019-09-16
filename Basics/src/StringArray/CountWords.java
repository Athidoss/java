package StringArray;

public class CountWords {

	public static void main(String[] args) {
		String s="India is my country";
		String e[]=s.split(" ");
		int count=0;
		for(int i=0;i<e.length;i++)
		{
		count=count+1;
		}
System.out.print(count);
	}

}
