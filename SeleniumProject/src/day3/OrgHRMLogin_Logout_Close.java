package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrgHRMLogin_Logout_Close {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("username"));
		username.click();
		Thread.sleep(5000);
		username.sendKeys("Admin");
		Thread.sleep(5000);
//		username.clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("Button")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("oxd-userdropdown-img")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();

//		driver.close();
		driver.quit();
	}

}
