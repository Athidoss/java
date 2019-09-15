package BasicsProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number:");
		int e = a.nextInt();
		boolean flag = false;
		for (int i = 2; i <= e / 2; i++) {
			if (e % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.print("The number is not prime");
		} else {
			System.out.print("The number is prime");
		}

	}

}
