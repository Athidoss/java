package MyArray;

public class ReplceElement {

	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 6, 5, 6 };
		// Logic to replace
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 6) {
				a[i] = 5;
			}
		}

		// Logic to print
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

}
