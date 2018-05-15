package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helper.utility;


public class primusbanklogoutpage {

	WebDriver driver;

	 public primusbanklogoutpage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	

	
	@FindBy(xpath="//*[@id='Table_02']/tbody/tr/td[3]/a/img") WebElement logout;
	
	
	public void logOutFromApplication()
	{
	
		utility.waitForWebElement(driver, logout, 20).click();
	}
	
}


