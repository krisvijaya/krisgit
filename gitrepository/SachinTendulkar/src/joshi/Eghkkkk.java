package joshi;

import java.util.Scanner;

public class Eghkkkk 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word");
		String x=sc.nextLine();
		String rev="";
		for(int i=x.length()-1;i>=0;i--)
		{
			rev=rev+x.charAt(i);
         }
		System.out.println(rev);
		if(x.equals(rev))
		{
			System.out.println("number is palindrom");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
