package daddy;

import org.testng.annotations.DataProvider;

public class Mydata
{
	@DataProvider(name="search word")
	public static Object[][] testdata()
	{
		return new Object[][]
				{
			{"kalam"},
			{"appuium"},
			{"ronaldo"}
				};
	}
	                        
}
