package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitwaitEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/ProgressBar.html");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		driver.findElement(By.id("cricle-btn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='100']")));
		boolean flag = driver.findElement(By.xpath("//div[text()='100']")).isDisplayed();
		System.out.println(flag);
	}

}
