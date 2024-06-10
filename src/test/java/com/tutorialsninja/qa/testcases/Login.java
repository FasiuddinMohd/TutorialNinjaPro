package com.tutorialsninja.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	
	public void VerifyLoginWithValidCredentials() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("fasiuddin074@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("welcome123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();		
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		driver.quit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	
	public void VerifyLoginWithInvalidCredentials() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		//driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("fasiuddin0748987@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String ActualWarning = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarning = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(ActualWarning.contains(ExpectedWarning),"Expected warning message is not displayed");
		driver.quit();
	}
}
