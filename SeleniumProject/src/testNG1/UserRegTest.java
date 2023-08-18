package testNG1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegTest extends TestNGMaster{

	@Test
	public void orgUserReg() throws InterruptedException{
		expval = uname;
		boolean flag = false;
		Thread.sleep(5000);
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		driver.findElement(By.id("systemUser_employeeName_empName")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> unames = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]/a"));
		for(int i = 0; i < unames.size(); i++){
			actval = unames.get(i).getText();
			
			if(expval.equals(actval)){
				flag = true;
				break;
			}
		}
		
		Assert.assertEquals(flag, true);
	}
}
