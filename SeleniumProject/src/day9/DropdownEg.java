package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement country = driver.findElement(By.name("country"));
		
		Select s = new Select(country);
		
//		s.selectByIndex(4);
//		Thread.sleep(5000);
//		s.selectByValue("BURMA");
//		Thread.sleep(5000);
//		s.selectByVisibleText("INDIA");
		
		List<WebElement> cities = s.getOptions();
		System.out.println(cities.size());
		
		for(int i = 0; i < cities.size(); i++){
			String cName = cities.get(i).getText();
			System.out.println(cName);
			s.selectByVisibleText(cName);
		}
	}

}
