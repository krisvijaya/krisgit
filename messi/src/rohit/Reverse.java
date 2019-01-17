package rohit;

import java.util.Scanner;

public class Reverse 
{

	public static void main(String[] args)
	{
	 String x="preeti";
      /*Scanner sc=new Scanner(System.in);
	  System.out.println("enter a word");
	  String x=sc.nextLine();*/
	String y="";
	for(int i=x.length()-1;i>=0;i--)
	{
		char c=x.charAt(i);
		y=y+c;
	}
     System.out.println(y);
     if(x.equals(y))
     {
    	 System.out.print("palindrome");
     }
     else
     {
    	 System.out.print(" not palindrome"); 
     }
	}
	

}
