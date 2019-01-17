package joshi;

public class Pyramidshape
{

	public static void main(String[] args)
	{
		int x = 5, k = 0;

        for(int i = 1; i <= x; i++,k=0)
        {
            for(int j = 1; j <=x-i; j++) 
            {
                System.out.print("  ");
            }

          while(k != 2 * i - 1) 
            {
                System.out.print(" * ");
               ++k;
            }

            System.out.println();
        }
     }
	}



	


