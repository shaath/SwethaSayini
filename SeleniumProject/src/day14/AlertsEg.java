package day14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		
		WebElement u = driver.findElement(By.id("txtuId"));
		u.sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("bdgiogh");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();

	}

}
