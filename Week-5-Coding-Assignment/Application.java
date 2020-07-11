
public class Application {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		asteriskLogger.log("Banana");
		asteriskLogger.error("I can't believe how many asterisks I need to surround this string in a box!");
	
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Seperated Letters");
		spacedLogger.error("Seperated Letters Redux");
		
	}
	

}
