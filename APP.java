package W5CodingAssignment;

public class APP {
	public static void main(String[]args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello");
		asteriskLogger.error("Try again.");
		
		//System.out.println();
		
		spacedLogger.log("Bye");
		spacedLogger.error("WARNING!");
		
		
	}
}
