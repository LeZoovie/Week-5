package W5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***" + "\n");
		
	}

	@Override
	public void error(String log) {
		System.out.println("****************************" + "\n***ERROR: "+ "SUPER DANGER!!!" +"***" + "\n****************************\n");
	}		
}

	