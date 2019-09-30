package collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MyTreeset {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("low");
		ts.add("Ram");
		ts.add("Dev");
		ts.add("Krish");
		ts.add("high");
		ts.add("Alibaba");
		ts.add("dev");
		ts.contains("Alibaba");
		System.out.println(ts);
		
	}

}
