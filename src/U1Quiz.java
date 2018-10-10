
import javax.swing.JOptionPane;

public class U1Quiz {

	public static void main(String[] args) {
		
		int computerWins = 0;

		int userWins = 0;
		
		int dieRoll = (int)(Math.random() * 6) + 1;

		int userRoll = (int)(Math.random() * 6) + 1;
		
		String input;
		

	while (dieRoll > userRoll) {
		computerWins ++;
		System.out.println("1 point for the computer");
	}
	
	while (dieRoll < userRoll) {
		userWins ++;
		System.out.println("1 point for you");
	}
	
	while (dieRoll == userRoll) {
		System.out.println("tie");
	}
		


	}

}
