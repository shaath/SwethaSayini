package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_KeyboardEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bing.com/");
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(360));
		Thread.sleep(20000);
		WebElement img = driver.findElement(By.linkText("Images"));
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(img).perform();
//		Thread.sleep(5000);
//		act.contextClick().perform();
		
		act.moveToElement(img).contextClick().build().perform();
		Thread.sleep(5000);
//		act.sendKeys(Keys.chord("P")).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ENTER).perform();
	}

}
