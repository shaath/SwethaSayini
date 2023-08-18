package testNG1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpRegTest extends TestNGMaster{

	@Test(dataProvider = "data")
	public void orgEmpReg(String f, String l, String eid){
		System.out.println(f+"---"+l+"---"+eid);
		
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data(){
		Object[][] x = new Object[4][3];
		
		x[0][0] = "Rachana";
		x[0][1] = "K";
		x[0][2] = "RK4579";
		
		x[1][0] = "Raji";
		x[1][1] = "R";
		x[1][2] = "RR8978";
		
		x[2][0] = "Sravanthi";
		x[2][1] = "K";
		x[2][2] = "SK8978";
		
		x[3][0] = "Shilpa";
		x[3][1] = "E";
		x[3][2] = "SE8978";
 		
		return x;
	}
}