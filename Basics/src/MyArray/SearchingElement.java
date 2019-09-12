package MyArray;

public class SearchingElement {

	public static void main(String[] args) {
		int a[]={9,8,9,4};
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==9)
			{
				flag=true;
				break;
			}
		}
		{
            if(flag)
            	System.out.print("9 is found");
            else
            	System.out.print("9 is not found");
		}
	}

}
