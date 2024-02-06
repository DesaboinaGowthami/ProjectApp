package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Registrationpage;
import testBase.BaseClass;

public class TC_001_New_Account_Registration extends BaseClass
{
	@Test
	public void AccountRegistartion() throws InterruptedException {
		Homepage hp=new Homepage(driver);
		Registrationpage rp=new Registrationpage(driver);
		hp.click_Myact();
		hp.click_Register();
		Thread.sleep(5000);
		rp.setFirstname("test");
		rp.setLastname("user");
		rp.setEmail("test@gmail.com");
		rp.setPassword("test@123");
		rp.clickContinue();		
	}
}




