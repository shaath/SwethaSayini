package day12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowhandlingEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		
		String gmail = driver.getWindowHandle();
//		System.out.println(gmail);
		
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(5000);
		Set<String> s = driver.getWindowHandles();
		
		for(String wid: s){
			System.out.println(wid);
			driver.switchTo().window(wid);
			
//			if(driver.getTitle().contains("Privacy")){
//				driver.findElement(By.linkText("Terms of Service")).click();
//				break;
//			}
			try {
				driver.findElement(By.linkText("Terms of Service")).click();
				Thread.sleep(5000);
				System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
				break;
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		driver.switchTo().window(gmail);
		
		driver.quit();
	}

}
