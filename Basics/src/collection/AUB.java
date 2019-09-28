package collection;

import java.util.LinkedHashSet;

public class AUB {

	public static void main(String[] args) {
		int a[]={7,5,4,3,2,1};
		int b[]={7,4,9,11,13};
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
			lhs.add(a[i]);
		for(int i=0;i<b.length;i++)
			lhs.add(b[i]);
		System.out.println(lhs);
		
		
	}

}
