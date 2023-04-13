

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import DriverFactory.DriverFactory;
import Libraries.Action;
import Libraries.ActionFactory;
import Libraries.ThroughActionsClass;
import Libraries.ThroughJavaScript;
import Libraries.ThroughSelenium;

public class BaseTest {
	Action act;
	String type;
	WebDriver driver;
	@BeforeSuite
	public void setUp (){
		try {
			driver=DriverFactory.createInstance("Chrome");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1() {
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[text()='Accept all']/..")).click();
		List<WebElement> tags=driver.findElements(By.tagName("a"));
		System.out.println(tags.size());
		
		Assert.assertEquals(tags.size(), 21);
		//WebElement ele=driver.findElement(By.xpath("abc"));
		//Action act=ActionFactory.createAction("Javascript");
		//act.performClick(ele);
		
		driver.quit();
		
		
	}
}
