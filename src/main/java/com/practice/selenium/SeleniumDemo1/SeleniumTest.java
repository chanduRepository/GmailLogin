package com.practice.selenium.SeleniumDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	public WebDriver driver;

	String appUrl = "https://accounts.google.com";

	@Test
	public void gmailLogin() {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://gmail.com");

		driver.manage().window().maximize();

	}
}
