package day1;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFLaunchEg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\SwethaRecodings\\Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
	}

}
