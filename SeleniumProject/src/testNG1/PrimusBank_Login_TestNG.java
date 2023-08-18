package testNG1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimusBank_Login_TestNG {

	FirefoxDriver driver;
	@BeforeClass
	public void prmBrLaunch(){
		System.setProperty("webdriver.gecko.driver", "D:\\SwethaRecodings\\Jars\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@BeforeMethod
	public void prmLaunch(){
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	}
	
	@Test
	public void prmLogin(){
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterMethod
	public void prmLogout(){
		driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
	}
	
	@AfterClass
	public void prmClose(){
		driver.close();
	}
	
}
