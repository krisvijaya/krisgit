package joshi;

public class StringHandling {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("preeti");
		sb.insert(6, 's');
		System.out.println(sb);
	     String s1="preeti";
		String s2 = "preeti";
		if(s1.equals(s2))
		{
			System.out.println("same String");
		}
		else
		{
			System.out.println("not same");
		}
		s2=s1.concat(" love krish");
		System.out.println(s2);
	}

}
