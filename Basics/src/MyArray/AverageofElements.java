package MyArray;

public class AverageofElements {

	public static void main(String[] args) {
		int k[]={1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<k.length;i++)
		{
			sum=sum+k[i];
			
		}
System.out.print(sum/k.length);
	}

}
