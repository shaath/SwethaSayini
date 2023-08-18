package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxEg {

	public static void main(String[] args) {
//		String currPrpath = System.getProperty("user.dir");
//		System.out.println(currPrpath);

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		WebElement milk = driver.findElement(By.name("option1"));
		
//		System.out.println(milk.isSelected());
//		System.out.println(milk.isDisplayed());
//		System.out.println(milk.isEnabled());
		
		if (!milk.isSelected()) {
			milk.click();
		}
		
	}

}
