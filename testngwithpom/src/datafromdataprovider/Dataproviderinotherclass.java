package datafromdataprovider;

import org.testng.annotations.DataProvider;

public class Dataproviderinotherclass 
{
	@DataProvider(name="login details")
	public static Object[][] testdata()
	{
		return new Object[][]
			{
			{"psrinath494","psrinath45045"},
			{"sathishnarasimha","vitarka2k14"}
		   };
		
	}
}
