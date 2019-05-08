import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String play = null;
do {
		System.out.println("WELCOME TO ROCK PAPER SCISSORS!");
		System.out.println();

		String userName = Validator.getString(scan, "Enter your name\n");

		System.out.println("Hello " + userName);



		// Condition enum
		//Roshambo move = null;
		
		//
		System.out.println("Would youlike to play against Dylan or Matt? (d/m)");
		String opponent = scan.nextLine();
//
		System.out.println("Rock, Paper or Scissor? (r/p/s)");
		String userMove  = scan.nextLine();
		
		if( userMove.contentEquals("r")) {
			userMove = "Rock";
		}
		else if(userMove.contentEquals("p")) {
			userMove = "Paper";
		
		}else if(userMove.contentEquals("s")) {
			userMove = "Scissor";
	}	
			
		System.out.println(userName + ": " + userMove);
		String play1 = null;
		
		//
		if (opponent.contentEquals("d")) {
//			move = Roshambo.Rock;
//			System.out.println(Roshambo.Rock);
			
			play1 =("Dylan: " + "Rock");

		} else if (opponent.contentEquals("m")) {
//			move = (Roshambo) Roshambo.random();
//			System.out.println(Roshambo.random());
			play  = RoshamboApp.random();
			
			}else {
			System.out.println("Invalid opponent");
		}
		
		System.out.println(RoshamboApp.winner(userMove, play));
		
		System.out.println("would you like to play again? (y/n)");
		play1 = scan.nextLine();
}while(play.contentEquals("y"));
		System.out.println("Goodbye");
	}
	
	
	
	
	
	public static String winner(String userMove, String oppMove) {
		String winner = null;
		if( userMove == oppMove) {
			winner = ("Its a Tie");
		}else if (userMove.equals("Rock")) 
		       if (oppMove.equals("Scissors")) 
		    	   winner = ("Rock crushes scissors. You win!!");
		     else if (oppMove.equals("Paper")) 
		    	 winner = ("Paper eats rock. You lose!!"); 
		     else if (userMove.equals("Paper")) 
		        if (oppMove.equals("Scissor")) 
		        	winner = ("Scissor cuts paper. You lose!!"); 
		     else if (oppMove.equals("Rock")) 
		    	 winner = ("Paper eats rock. You win!!"); 
		     else if (userMove.equals("Scissor")) 
		          if (oppMove.equals("Paper")) 
		        	  winner = ("Scissor cuts paper. You win!!"); 
		     else if (oppMove.equals("Rock")) 
		    	 winner = ("Rock breaks scissors. You lose!!"); 
		     else 
		    	 winner = ("Invalid user input."); 
		
		return winner;
		
		
	}
	public static String random( ) {
	String[] move = {"Rock", "Paper", "Scissor"};
    Random r = new Random();
    int randomNumber = r.nextInt(move.length);
	System.out.println("Matt: " + move[randomNumber]);
	return ("Matt: " + move[randomNumber]);

		
	}

}
