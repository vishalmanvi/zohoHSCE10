package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFw extends BaseTest {

	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="testdata")
	public static  void LoginTest(String username,String password) throws InterruptedException  {
		
		System.out.println("hello");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.linkText(loc.getProperty("Signin_link"))).click();
		    driver.findElement(By.xpath(loc.getProperty("email_field"))).sendKeys(username);
			driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
			driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
			driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
            driver.manage().window().maximize();
			driver.findElement(By.xpath(loc.getProperty("skip_later_button"))).click();
			Thread.sleep(3000);
	}
	

}
