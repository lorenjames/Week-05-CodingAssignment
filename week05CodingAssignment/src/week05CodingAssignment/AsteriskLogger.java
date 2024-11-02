package week05CodingAssignment;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		
		String asteriskBox = "*************";
		
		for (int i = 0; i < error.length(); i++) {
			asteriskBox += "*";
		}
		
		System.out.println(asteriskBox);
		System.out.println("***Error: " + error + "***");
		System.out.println(asteriskBox);
		
	}

}
