package week05CodingAssignment;

public class App {

	static Logger logger;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = new AsteriskLogger();
		System.out.println("AsteriskLogger Log: ");
		logger.log("Test Asterisk Log");
		System.out.println();
		System.out.println("AsteriskLogger Error: ");
		logger.error("TEST ASTERISK ERROR");
		
		Logger logger2 = new SpacedLogger();
		System.out.println();
		System.out.println("SpacedLogger Log: ");
		logger2.log("Test Spaced Log");
		System.out.println();
		System.out.println("SpacedLogger Error: ");
		logger2.error("TEST SPACED ERROR");

		

	}

	

}
