package week05CodingAssignment;

public class App {

	static Logger logger;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = new AsteriskLogger();
		logger.log("Test Asterisk Log");
		logger.error("TEST ASTERISK");
		
		Logger logger2 = new SpacedLogger();
		logger2.log("Test Spaced Log");
		logger2.error("TEST SPACED ERROR");

		

	}

	

}
