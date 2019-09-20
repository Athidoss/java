package String;

public class Hashcode {

	public static void main(String[] args) {
		String a="athi";
		System.out.println(a.hashCode());
		String b="doss";
		System.out.println(b.hashCode());
		String c = new String("doss");
		String d = new String("doss");
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		

	}

}
