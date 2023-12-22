package org.ictkerala.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver = null;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public void setUsername(String userinp) {
		WebElement usern = driver.findElement(By.id("user-name"));
		usern.sendKeys(userinp);
	}

	public void setPass(String passw) {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(passw);
	}

	public void butnClick() {
		WebElement butncl = driver.findElement(By.id("login-button"));
		butncl.click();
	}
}
