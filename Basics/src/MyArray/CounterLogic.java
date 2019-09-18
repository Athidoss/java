package MyArray;

public class CounterLogic {

	public static void main(String[] args) {
		int a[] = { 9, 8, 9, 4, 9 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 9) {
				count = count + 1;
			}
		}
		System.out.print(count);
	}

}
