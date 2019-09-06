package Recursion;

public class Factorial {
	static int fact(int n)
	{
		if (n==0)
			return 1;
		else
			return(n*fact(n-1));	
	}

	public static void main(String[] args) {
   // Factorial obj = new Factorial();
   System.out.println(fact(5));
	}

}
