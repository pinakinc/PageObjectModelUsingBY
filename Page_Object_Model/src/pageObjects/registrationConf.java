package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class registrationConf {
	
	    WebDriver driver;
	    By registerconftxt = By.xpath("//*");
		public registrationConf(WebDriver driver)
		{
			this.driver=driver;
		}

	public String getpagetext()
	{
		
		
		String verifytxt=driver.findElement(registerconftxt).getText();
		return verifytxt;
		
	}


}
