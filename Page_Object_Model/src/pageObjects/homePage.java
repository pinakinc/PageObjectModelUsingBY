package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class homePage {
	
	WebDriver driver;
	By registerlnk = By.xpath("//a[contains(text(),'REGISTER')]");
	
	public homePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public Registration clickLink()
	{
		driver.findElement(registerlnk).click();
		return new Registration(driver);
	}
}
