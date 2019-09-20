package String;

import java.util.Scanner;

public class Replacechar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String a = scan.nextLine();
		char c[] = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a') {
				c[i] = '@';
			}
			else
			{
				c[i]=a.charAt(i);
			}
			System.out.print(c[i]);

		}
		scan.close();
	}

}
