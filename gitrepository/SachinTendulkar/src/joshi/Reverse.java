package joshi;

import java.util.Scanner;

public class Reverse
{
public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String x=sc.nextLine();
		String rev= " ";
		//int i;
		for(int i=x.length()-1;i>=0;i--)
		{
		rev=rev+x.charAt(i);
		}
         System.out.println(rev);
         
         if(x.equals(rev))
        {
          System.out.println("its a palindrome");
        }
         else
        {
        	 System.out.println("number is not palindrome");
        }
	}
	

}
