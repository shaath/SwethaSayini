package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import functionalDriven.GenericMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest_POM{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		driver.get(lp.url);
		lp.orgLogin();
		Thread.sleep(3000);
		AdminHomePage ap = PageFactory.initElements(driver, AdminHomePage.class);
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
