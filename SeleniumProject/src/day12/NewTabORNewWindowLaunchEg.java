package day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabORNewWindowLaunchEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://facebook.com");
	}

}
