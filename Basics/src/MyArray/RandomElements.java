package MyArray;

public class RandomElements {

	public static void main(String[] args) {
		double a[]=new double[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=Math.random();
			System.out.println(a[i]);
		}
	}

}
