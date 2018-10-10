
import javax.swing.JOptionPane;

public class U1Quiz {

	public static void main(String[] args) {
		
		int computerWins = 0;

		int userWins = 0;

		int dieRoll = (int)(Math.random()) * 6 + 1;

		int userRoll = (int)(Math.random()) * 6 + 1;
		
		String input;
		
		input = JOptionPane.showInputDialog("Get ready to play!");
	while (userWins != 10) {
		do {
			input = JOptionPane.showInputDialog("you lose");
			userRoll = Integer.parseInt(input);
		} while (userRoll < dieRoll);
		computerWins ++;
		
		do {
			input = JOptionPane.showInputDialog(null, "you win");
			userRoll = Integer.parseInt(input);
		} while (userRoll > dieRoll);
		userWins ++;
		
		do {
			input = JOptionPane.showInputDialog(null, "it's a tie");
			userRoll = Integer.parseInt(input);
		} while (userRoll == dieRoll);	
	}


	}

}
