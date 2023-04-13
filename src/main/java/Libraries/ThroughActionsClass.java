package Libraries;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class ThroughActionsClass extends Action {

	public void performClick(WebElement ele) {
		
		Actions action = new Actions(driver); 
		action.moveToElement(ele).click();
					
	}
}