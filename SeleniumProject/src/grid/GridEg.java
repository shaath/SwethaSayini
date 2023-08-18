package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridEg {

	@Parameters({"br", "pt"})
	@Test
	public void grideg1(String br, String pt) throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap = null;
		if (br.equalsIgnoreCase("Firefox") && pt.equalsIgnoreCase("windows")) {
			cap = new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}else if (br.equalsIgnoreCase("Chrome") && pt.equalsIgnoreCase("windows")) {
			cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}else if (br.equalsIgnoreCase("Edge") && pt.equalsIgnoreCase("windows")) {
			cap = new DesiredCapabilities();
			cap.setBrowserName("MicrosoftEdge");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.8:4444/wd/hub"), cap);
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
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
