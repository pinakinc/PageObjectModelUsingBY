package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class Registration {
	
	WebDriver driver;
	By firstName = By.xpath("//input[@name='firstName']");
	By lastName=By.xpath("//input[@name='lastName']");
	By phone=By.xpath("//input[@name='phone']");
	By userName=By.xpath("//input[@id='userName']");
	By address1=By.xpath("//input[@name='address1']");
	By address2=By.xpath("//input[@name='address2']");
	By city=By.xpath("//input[@name='city']");
	By state=By.xpath("//input[@name='state']");
	By postalCode=By.xpath("//input[@name='postalCode']");
	By country=By.xpath("//select[@name='country']");
	By email=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@name='password']");
	By confirmPassword=By.xpath("//input[@name='confirmPassword']");
	By register=By.xpath("//input[@name='register']");

	
	public Registration(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public registrationConf registerUser()
	{
		driver.findElement(firstName).sendKeys("Pinakin");
		driver.findElement(lastName).sendKeys("Chaubal");
		driver.findElement(phone).sendKeys("8652027532");
		driver.findElement(userName).sendKeys("pinakinc");
		driver.findElement(address1).sendKeys("357 Brittany Farms Road");
		driver.findElement(address2).sendKeys("Apt 103");
		driver.findElement(city).sendKeys("New Britain");
		driver.findElement(state).sendKeys("Connecticut");
		driver.findElement(postalCode).sendKeys("06053");
		Select drpdown = new Select(driver.findElement(country));
		drpdown.selectByVisibleText("UNITED STATES");
		driver.findElement(email).sendKeys("pinakinc@yahoo.com");
		driver.findElement(password).sendKeys("p9121975");
		driver.findElement(confirmPassword).sendKeys("p9121975");
		driver.findElement(register).click();
		return new registrationConf(driver);
		
	}
}
