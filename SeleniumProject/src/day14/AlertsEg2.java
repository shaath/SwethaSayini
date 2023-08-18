package day14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsEg2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.dismiss();
	}

}
