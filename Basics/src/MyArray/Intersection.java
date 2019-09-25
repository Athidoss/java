package MyArray;

//Java code to demonstrate star patterns 
public class Intersection 
{ 
 

 // Driver Function 
 public static void main(String args[]) 
 { String s="computer";
	
 int i, j; 

 // outer loop to handle number of rows 
 //  n in this case 
 for(i=0; i<s.length(); i++) 
 { 

     //  inner loop to handle number of columns 
     //  values changing acc. to outer loop     
     for(j=0; j<=i; j++) 
     { 
         // printing stars 
         System.out.print(s.charAt(j) ); 
     } 

     // ending line after each row 
     System.out.println(); 
 } 
} 
	 
	  
 } 
