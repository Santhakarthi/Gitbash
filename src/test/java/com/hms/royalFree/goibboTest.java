package com.hms.royalFree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibboTest {

	public static void main(String[] args) throws Throwable{
		int date = 25;
		String monthAndYear = "March 2024";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		
		
		
		
	}

}
