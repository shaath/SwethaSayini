package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEg2 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");

//		driver.findElement(By.linkText("Home")).click();
		
//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
//		List<WebElement> links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
//		for(int i = 0; i < links.size(); i++){
//			String lName = links.get(i).getText();
//			System.out.println(lName);
			
//			if(lName.equals("Home")){
//				links.get(i).click();
//				break;
//			}
//		}
		
		driver.findElement(By.xpath("//table[@id='Table_011']")).findElement(By.linkText("Home")).click();
	}

}
