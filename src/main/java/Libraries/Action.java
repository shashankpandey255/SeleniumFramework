package Libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DriverFactory.DriverFactory;

public abstract class Action extends DriverFactory{
	WebDriver driver=DriverFactory.createInstance("Chrome");
	public abstract void performClick(WebElement ele);
}
