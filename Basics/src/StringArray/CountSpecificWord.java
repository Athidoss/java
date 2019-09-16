package StringArray;

public class CountSpecificWord {

	public static void main(String[] args) {
		String s="India is my country";
		String e[]=s.split(" ");
		int count=0;
		for(int i=0;i<e.length;i++)
		{
			if(e[i].equals("is"))
				count=count+1;
		}
		System.out.println(count);

	}

}
