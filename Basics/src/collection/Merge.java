package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Merge {

	public static void main(String[] args) {
		int a[] = { 7, 5, 4, 3, 2, 1 };
		int b[] = { 7, 4, 9, 11, 13 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++)
			al.add(a[i]);
		for (int i = 0; i < b.length; i++)
			al.add(b[i]);
		System.out.println(al);

	}

}
