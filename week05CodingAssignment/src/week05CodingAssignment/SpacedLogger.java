package week05CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			sb.append(log.charAt(i));
			if (i < log.length()-1) {
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			sb.append(error.charAt(i));
			if (i < error.length()-1) {
				sb.append(" ");
			}
		}
		System.out.println("ERROR: " + sb.toString());
		
	}

}
