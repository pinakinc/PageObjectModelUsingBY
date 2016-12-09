package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Registration;
import pageObjects.homePage;
import pageObjects.registrationConf;

public class testFramework {
    WebDriver driver;
    public homePage hmPage;
    public Registration registerpg;
    public registrationConf registrationconf;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhagyashree\\Desktop\\Documents\\Selenium\\jars\\chromedriver.exe");

		driver = new ChromeDriver();
		hmPage = new homePage(driver);
		registerpg = new Registration(driver);
		registrationconf=new registrationConf(driver);
        driver.get("http://newtours.demoaut.com");

	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

	
	@Test
	public void clickLink1()
	{
		
		hmPage.clickLink();
	}
	
	@Test(dependsOnMethods = { "clickLink1" })
	public void testRegister()
	{
		registerpg.registerUser();
	}
	
	@Test(dependsOnMethods = { "testRegister" })
	public void confirmtext()
	{
		String verifytext=null;
		verifytext=registrationconf.getpagetext();
		Assert.assertTrue(verifytext.contains("Thank you1"));
		
		driver.quit();
	}

}
