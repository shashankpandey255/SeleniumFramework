package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	public static WebDriver createInstance(String browserType) {
		WebDriver driver;

		switch (browserType) {
		case "Chrome":
			ChromeOptions options=new ChromeOptions();
			options.addArguments("headlesss");
			options.addArguments("diable-gpu");
			driver = new ChromeDriver(options);
			break;

		case "Edge":
			driver = new EdgeDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;
			
		default:
            return null;
		}
		return driver;
	}

}
