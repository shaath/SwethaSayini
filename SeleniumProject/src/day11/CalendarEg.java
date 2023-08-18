package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarEg {

	public static void main(String[] args) throws InterruptedException {
		String d = "23/March/2024";
		String[] x = d.split("/");
		String exp_m_y = x[1]+" "+x[2];
		String exp_d = x[0];
		
//		System.out.println(exp_d);
//		System.out.println(exp_m_y);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollTo(0, 300)");
		
		driver.findElement(By.xpath("//div[@class='row  p-relative ']//*[local-name()='mask']/..")).click();

		String act_m_y = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText();
		System.out.println(act_m_y);
		
		while(!exp_m_y.equals(act_m_y)){
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow'] ")).click();
			act_m_y = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText();
		}
		
//		driver.findElement(By.xpath("(//div[text()='"+exp_d+"'])[1]")).click();
		List<WebElement> days = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[1]//div[contains(@class,'DayPicker-Day')]"));
		for(int i = 0; i < days.size(); i++){
			String dd = days.get(i).getAttribute("aria-label");
			System.out.println(dd);
			if(dd!=null && dd.contains(exp_d)){
				days.get(i).click();
				break;
			}
		}
	}

}
