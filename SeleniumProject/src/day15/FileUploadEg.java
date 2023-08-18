package day15;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
//		driver.findElement(By.id("photofile")).click();
		WebElement ele = driver.findElement(By.id("photofile"));
		ele.sendKeys("C:\\Users\\SharatChandra\\Desktop\\8114925.JPG");
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		je.executeScript("arguments[0].click();", ele);
		
//		Thread.sleep(3000);
		
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUpload2.exe");
	}

}
