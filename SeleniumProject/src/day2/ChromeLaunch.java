package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SwethaRecodings\\Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com");
	}

}
