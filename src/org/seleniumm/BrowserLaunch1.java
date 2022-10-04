package org.seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	WebElement txtUserName = driver.findElement(By.id("username"));
	txtUserName.sendKeys("seeni4321");
	WebElement passWords =driver.findElement(By.name("password"));
	passWords.sendKeys("hahaha");
	WebElement btlog =driver.findElement(By.xpath("//input[@class='login_button']"));
	btlog.click();
	
}
}
