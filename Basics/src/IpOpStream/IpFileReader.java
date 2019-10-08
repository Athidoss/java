package IpOpStream;

import java.io.FileReader;
import java.io.FileWriter;

public class IpFileReader {

	public static void main(String[] args) {
		String s="";
		try
		{
			FileReader fr=new FileReader("K:/Java/india.txt");	
			int i;
		while((i=fr.read())!=-1){
			//System.out.println((char)i);
			s=s+(char)i;
				
			}
		
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println(s);

	}

}
