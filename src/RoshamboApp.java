import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String play = null;
		Player theJets = new PlayerRock();
		Player theSharks = new PlayerRandom();
		Player user = new PlayerUser();
//		
//============== Start ========================================
//
		do {
			//
			System.out.println("WELCOME TO ROCK, PAPER, SCISSORS!");
			System.out.println();
//
//--------------Get user info --------------------------------
//
			String name = Validator.getString(scan, "Enter your name\n");
			user.setName(name);
//
			System.out.println("Hello " + user);
//
			System.out.println("Would you like to play against TheJets or TheSharks? (j/s)");
			String opponent = scan.nextLine();
//
			System.out.println("Rock, Paper or Scissor? (r/p/s)");
			String userMove = scan.nextLine();
			//user.setMove(userMove);
			//
			//
			if (userMove.contentEquals("r")) {
				userMove = "Rock";
			} else if (userMove.contentEquals("p")) {
				userMove = "Paper";

			} else if (userMove.contentEquals("s")) {
				userMove = "Scissor";
			}

			System.out.println(user + userMove);

			//
			if (opponent.contentEquals("j")) {

				System.out.println(theJets.toString());

			} else if (opponent.contentEquals("s")) {

				play = RoshamboApp.random();

			} else {
				System.out.println("Invalid opponent");
			}

			//System.out.println(RoshamboApp.winner(userMove, play));

			System.out.println("would you like to play again? (y/n)");
			play = scan.nextLine();
		} while (play.contentEquals("y"));
		System.out.println("Goodbye");
	}
//
//	public static String winner(String userMove, String oppMove) {
//		String winner = null;
//		if (userMove == oppMove) {
//			winner = ("Its a Tie");
//		} else if (userMove.equals("Rock"))
//			if (oppMove.equals("Scissors"))
//				winner = ("Rock crushes scissors. You win!!");
//			else if (oppMove.equals("Paper"))
//				winner = ("Paper eats rock. You lose!!");
//			else if (userMove.equals("Paper"))
//				if (oppMove.equals("Scissor"))
//					winner = ("Scissor cuts paper. You lose!!");
//				else if (oppMove.equals("Rock"))
//					winner = ("Paper eats rock. You win!!");
//				else if (userMove.equals("Scissor"))
//					if (oppMove.equals("Paper"))
//						winner = ("Scissor cuts paper. You win!!");
//					else if (oppMove.equals("Rock"))
//						winner = ("Rock breaks scissors. You lose!!");
//					else
//						winner = ("Invalid user input.");
//
//		return winner;

//	}

	public static String random() {
		String[] move = { "Rock", "Paper", "Scissor" };
		Random r = new Random();
		int randomNumber = r.nextInt(move.length);
		System.out.println("Matt: " + move[randomNumber]);
		return ("Matt: " + move[randomNumber]);

	}

}
