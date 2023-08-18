package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
//		System.out.println(driver.findElement(By.linkText("PIM")).getLocation());
//		driver.findElement(RelativeLocator.with(By.linkText("Admin")).toLeftOf(By.linkText("PIM"))).click();
				
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(5000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		
		for(int i = 0; i < rows.size(); i++){
//			System.out.println(rows.get(i).getText());
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			String id = cols.get(1).getText();
			System.out.println(id);
			if(id.equals("1715")){
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}
	}

}
