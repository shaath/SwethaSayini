package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EdgeLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\SwethaRecodings\\Jars\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://selenium.dev");
		
//		System.setProperty("webdriver.ie.driver", "D:\\SwethaRecodings\\Jars\\IEDriverServer.exe");
//		InternetExplorerDriver driver = new InternetExplorerDriver();
//		
//		driver.get("http://google.com");
	}

}
