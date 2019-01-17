package rohit;

import java.util.Scanner;

public class Preeti
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the numbers");
		 int l=sc.nextInt();
		int a=0,b=1,c;
		
		 System.out.println(a);
		 System.out.println(b);
		 c=a+b;
		 while(c<=l)
		 {
			
			System.out.println(c+" ");
			a=b;
			b=c;
			c=a+b;
		
		}
		
	    }
	}


    