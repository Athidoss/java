package BasicsProgram;

public class ProductOfPrimeNum {

	public static void main(String[] args) {
		int product = 1;
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;

			// int count=0;
			for (int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)

			{
				product = product * i;

			}

		}
		System.out.print(product);

	}

}
