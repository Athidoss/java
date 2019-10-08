package Pattern;

public class NoTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=0;i<5;i++)
		{int sum=0;
			for(int j=0;j<=i;j++)
			{sum=sum+n;
				System.out.print(n+" ");
				n=n+1;
				
			}
			System.out.print("---->"+sum);
			System.out.println();
		}

	}

}
