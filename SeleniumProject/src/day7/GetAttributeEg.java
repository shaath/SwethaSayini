package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");

		List<WebElement> links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		for(int i = 0; i < links.size(); i++){
			String lName = links.get(i).getAttribute("href");
			System.out.println(lName);
		}
	}
}
