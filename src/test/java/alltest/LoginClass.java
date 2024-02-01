package alltest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginClass {
	
	WebDriver dr;
	static ReadFile config = new ReadFile();

	@BeforeTest
	public void setup() {
		dr = new ChromeDriver();
		dr.get(config.getUrl());
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@Test
	public void loging() {
		WebElement user = dr.findElement(By.id("email"));
		WebElement pass = dr.findElement(By.id("pass"));
		user.sendKeys(config.getUser());
		pass.sendKeys(config.getPass());
		System.out.println("You are successfull");
		System.out.println("Change Commited");
		System.out.println("new Change please watch");

	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		dr.close();
	}

}
