package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutofillersEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Hyd");
		Thread.sleep(5000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//text[@class='placeHolderMainText']//ancestor::li"));
		System.out.println(ele.size());
		
		for(int i = 0; i < ele.size(); i++){
			WebElement city = ele.get(i);
			System.out.println(city.getText());
			if(city.getText().contains("Miyapur")){
				city.click();
				break;
			}
			
		}
	}

}
