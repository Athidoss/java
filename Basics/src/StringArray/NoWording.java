package StringArray;

public class NoWording {
	boolean validate(String s)
	{
		boolean a=true;
		if (s == null||s.isEmpty()) {
			a=false;
		}
		return a;

	}

	public static void main(String[] args) {
	NoWording a=new NoWording();
	System.out.println(a.validate(""));

		}
	}


