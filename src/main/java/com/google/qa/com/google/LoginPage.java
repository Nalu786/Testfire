package com.google.qa.com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	// global driver
	WebDriver driver;
//declaring objects
	By username = By.id("username");
	By password = By.name("password");
	By signin = By.xpath("//button[@type=\"submit\"]");

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

//finding the element by objects to run the project
	public void typeuserName() {

		driver.findElement(username).sendKeys("techfiosdemo@gmail.com");
	}

	public void password() {
		driver.findElement(password).sendKeys("abc123");

	}

	public void clickLoginBtn() {
		driver.findElement(signin).click();
	}

}
