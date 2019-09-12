package Recursion;

public class ReCursion1To10 {
	void adi(int n) {
		System.out.println(n);

		if (n <= 9) {
			adi(n + 1);// method calling 
		}
//	System.out.println(n);

	}

	public static void main(String[] args) {

		ReCursion1To10 obj = new ReCursion1To10();
		obj.adi(1);

	}

}
