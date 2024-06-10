package com.tutorialsninja.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferntBrowsers {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "Path of the Browser.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");		
			
		driver.manage().window().maximize();
		
		String CurPageURL=driver.getCurrentUrl();
		
		System.out.println(CurPageURL);
		
		String getTitile=driver.getTitle();
		
		System.out.println(getTitile);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
