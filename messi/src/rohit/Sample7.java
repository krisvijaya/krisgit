package rohit;

public class Sample7 
{
	public int x;
	public float y;
	public char z;
	public boolean w;
	public String s;
	public Sample7()
	{
		x=10;
		s="mindq";
		//z='d';
	}
	public Sample7(String temp)
	{
		x=10;
		s="temp";
	}
	public void display()
	{
		System.out.print(x);
		System.out.print(s);
		System.out.print(z);
		System.out.print(w);
		System.out.print(y);
		
	}
}
