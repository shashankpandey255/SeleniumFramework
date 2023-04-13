package Libraries;

public class ActionFactory {
	public static Action createAction(String type) {
		if(type.equals("javascript"))
			return new ThroughJavaScript();
		else if(type.equals("ActionsClass"))
			return new ThroughActionsClass();
		else if(type.equals("Selenium")){
			return new ThroughSelenium();
		}else {
			 String channel = null;
			throw new IllegalArgumentException("Unknown type "+channel);
		}
		
	}
}
