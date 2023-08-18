package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Primusbank_Login_Logout_Close {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		WebElement u = driver.findElement(By.id("txtuId"));
		
		u.sendKeys("Admin");
//		Thread.sleep(5000);
//		u.clear();
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
