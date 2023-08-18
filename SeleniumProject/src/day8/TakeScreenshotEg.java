package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		String path = "D:\\SwethaRecodings\\Workspace\\SeleniumProject\\src\\screenshots";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://bing.com");
		Thread.sleep(20000);
		//Takes screenshot of how much visible
//		File swetha = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(swetha, new File(path + "\\bing.png"));
		
//		File ele = driver.findElement(By.linkText("Gmail")).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(ele, new File(path + "\\gmail.png"));
		
		File fullScreenshot = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fullScreenshot, new File(path + "\\bingFullPage.png"));

	}

}
