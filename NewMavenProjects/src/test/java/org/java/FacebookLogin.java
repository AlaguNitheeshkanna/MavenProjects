package org.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
public static void main(String[] args) throws InterruptedException {
	//WebDriver
	WebDriver driver = new ChromeDriver();
	//Maximize
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	
	WebElement email  = driver.findElement(By.id("email"));
	email.sendKeys("nitheeshkannan");
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("123456");
	
	WebElement login = driver.findElement(By.id("loginbutton"));
	login.click();
	}
}

