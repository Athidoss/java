package WrapperClasses;

public class NumbertoBinary {

	public static void main(String[] args) {
		System.out.println("Decimal"+"\t"+"Binary"+"\t"+"Octal"+"\t"+"hexa");
		System.out.println("_____________________________");

		for(int i=0;i<=100;i++)
			
		{
		
			System.out.println("| "+i+"\t"+"| "+Integer.toBinaryString(i)+"\t"+"| "+Integer.toOctalString(i)+"\t"+"| "+Integer.toHexString(i)+" |");
			//  b                                                                                                    System.out.println("_____________________________");

		}
		
	}

}
