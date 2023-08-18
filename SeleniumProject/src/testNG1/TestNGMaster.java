package testNG1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import functionalDriven.GenericMethods;

public class TestNGMaster extends GenericMethods{
	public GenericMethods gm;
	public String expval, actval;
	FileInputStream fi;
	Properties pr;
	String br = "Firefox", url = "http://orangehrm.qedgetech.com";
	String u = "Admin", p = "Qedge123!@#";
	String f = "Ashwaj", l = "S", eid = "AS37465";
	String ename = f+" "+l, uname = f+l+"43256", pwd = "Test@5432167890";
	
	@BeforeTest
	public void orgLaunch() throws IOException{
		expval = "LOGIN";
		gm = new GenericMethods();
		
		fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\properties\\orgHRM.properties");
		pr = new Properties();
		pr.load(fi);
		gm.launchBr(br);
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		
		Assert.assertEquals(actval, expval, "Launch Failed");
	}
	
	@BeforeClass
	public void orgLogin() throws InterruptedException{
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		Assert.assertEquals(actval, expval, "Login Failed");
	}
	
	@AfterClass
	public void orgLogout() throws InterruptedException{
		Thread.sleep(5000);
		expval = "LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		Assert.assertEquals(actval, expval, "Logout Failed");
	}
	
	@AfterTest
	public void orgClose(){
		driver.close();
	}
}
