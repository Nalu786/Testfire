package com.google.qa.com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLoginPage {
	@Test

	public void verifyLogin() {

		System.setProperty("webdriver.chrome.driver", "C:\\Auto\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://techfios.com/test/billing/?ng=login/");

		LoginPage login = new LoginPage(driver);
		login.typeuserName();
		login.password();
		login.clickLoginBtn();

		driver.quit();

	}

}
