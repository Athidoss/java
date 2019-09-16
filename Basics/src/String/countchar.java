package String;

public class countchar {

	public static void main(String[] args) {
		String e="raja";
		int count=0;
		for(int i=0;i<e.length();i++)
		{
			if(e.charAt(i)=='a')
			{
				count=count+1;
			}
		}
		System.out.print(count);
		

		
	}

}
