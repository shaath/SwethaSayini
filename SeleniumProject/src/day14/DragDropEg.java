package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
//		driver.switchTo().frame(0);
		WebElement f = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(f);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		
//		act.dragAndDrop(drag, drop).perform();
		act.clickAndHold(drag).moveToElement(drop).click().build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Draggable")).click();
		
	}

}
