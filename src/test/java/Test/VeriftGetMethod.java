package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI;


public class VeriftGetMethod extends CreateAPI{
	

	@Test(enabled = false)
	public void TestGetMethod()
	{CreateAPI ref=new CreateAPI();
		ref.getMethod();
	}
	
	
	@Test
	public void CreateMethod() throws FileNotFoundException
	{
		CreateAPI obj=new CreateAPI();
		obj.createMethod();
	}
	@Test(enabled = false)
	public void DeleteMethod()
	{
		CreateAPI obj1=new CreateAPI();
		obj1.deleteMethod();
	}
	
}
