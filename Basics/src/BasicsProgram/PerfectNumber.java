package BasicsProgram;

public class PerfectNumber {

	public static void main(String[] args) {
		for(int num=1;num<=1000;num++)
		{
			int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
		
				sum=sum+i;
			}
						
			
			
		}
		
		if(num==sum)
		{
		 System.out.println(sum);
		}
			
		
		}

	}

}
