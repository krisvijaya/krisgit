package rohit;

import java.util.Scanner;

public class Palindrome
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter word");
        String x=sc.nextLine();
        String rev="";
        for(int i=x.length()-1;i>=0;i--)
        {
        	char z=x.charAt(i);
        	rev=rev+1;
        }
        if(x.equals("rev"))
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("not");
        }
   }

}
