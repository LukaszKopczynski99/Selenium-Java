import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	@Test
	void testTile()
	{
		
		String exp_title="Opencart";
		String act_title="Opencart";
		
		if(exp_title.equals(act_title))
		{
			System.out.println("Test pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test failed");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(exp_title, act_title);
		
	}

}
