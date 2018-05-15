package applicationtestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.Baseclass;
import Helper.utility;
import applicationpages.primusbankloginpage;
import applicationpages.primusbanklogoutpage;




public class primusbanklogintestcase extends Baseclass{
	@Test
	public void login()
	{

		primusbankloginpage login=PageFactory.initElements(driver, primusbankloginpage.class);
		
		primusbanklogoutpage logout=PageFactory.initElements(driver, primusbanklogoutpage.class);
		
		utility.waitforTitle(driver,"primusbank", 30);
		
		login.logintoprimusbank();
		
		utility.waitforURLContains(driver, "dashboard", 30);
		
		logout.logOutFromApplication();
		
		
		
	}
	
	
}


