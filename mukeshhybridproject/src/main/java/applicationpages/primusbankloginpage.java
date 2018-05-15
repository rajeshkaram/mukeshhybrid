package applicationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Helper.utility;
import applicationfactory.Dataproviderfactory;


public class primusbankloginpage {
	WebDriver driver;

	public primusbankloginpage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	
	

	@FindBy(xpath =("//*[@id='txtuId']"))
	WebElement username;
@FindBy(xpath=("//*[@id='txtPword']"))
	WebElement password;

@FindBy(xpath=("//*[@id='login']"))
	WebElement loginButton;

	public void logintoprimusbank() 
	{
		
		utility.waitForWebElement(driver, username, 20).sendKeys(Dataproviderfactory.getExcel().getData("Login", 0, 0));
		utility.waitForWebElement(driver, password, 20).sendKeys(Dataproviderfactory.getExcel().getData("Login", 0, 1));
		utility.waitForWebElement(driver, loginButton, 20).click();
	}

}