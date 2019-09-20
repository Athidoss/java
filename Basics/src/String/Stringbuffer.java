package String;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer a= new StringBuffer("madam");
		StringBuffer e= new StringBuffer(a);
		e.reverse();
		String x=a.toString();
		String y=e.toString();
		if(x.equals(y))
		{
			System.out.println("P"+"    "+e);
			
		}
		else
		{
			System.out.println("NP"+"     "+e);
		}
	}

}
