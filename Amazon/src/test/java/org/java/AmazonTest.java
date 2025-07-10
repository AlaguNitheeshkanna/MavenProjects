package org.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement allButton = driver.findElement(By.id("nav-hamburger-menu"));
		allButton.click();
		Thread.sleep(2000);
		
		WebElement newRelease = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[2]"));
		newRelease.click();
		
		WebElement comaccessories = driver.findElement(By.xpath("//a[text()='Computers & Accessories']"));
		comaccessories.click();
		Thread.sleep(2000);
		
		WebElement mobiles = driver.findElement(By.xpath("(//a[text()='Mobiles'])[1]"));
		mobiles.click();
		
		WebElement mobileclick = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]"));
		mobileclick.click();
		
		WebElement iphone15 = driver.findElement(
				By.xpath("(//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal'])[2]"));
		iphone15.click();
		Thread.sleep(2000);
		
		WebElement addToCart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		addToCart.click();
	}
}
