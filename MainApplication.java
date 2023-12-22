package week_06CodingProject;

public class MainApplication {

	public static void main(String[] args) {
//instansiated my players and deck
		Player player1 = new Player ("Sally");
		Player player2 = new Player ("Robert");
		Deck deck = new Deck();
//shuffled the deck then described to show the shuffled deck in my console
		deck.shuffle();
		deck.describe();
//calling the draw method and looping through a 52 card deck to deal out the deck to players	
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		} // end loop
	
//printed the start of the game to the console :)
		System.out.println("");
		System.out.println("***********************************");
		System.out.println("*********THE GAME BEGINS!!*********");
		System.out.println("***********************************");
		System.out.println("");
//for loop to start the game and call the flip method to flip the card for each player for each turn until the deck is gone.
		for (int i = 0; i < 26; i ++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();	
//printed to the console the players name, the card name, and card value after ever turn.
			System.out.println(player1.getName() + "'s card is: " + card1.getCardName() + " = " + card1.getValue());
			System.out.println(player2.getName() + "'s card is: " + card2.getCardName() + " = " + card2.getValue());
//if else statement to compare the values of the cards and increase the score of the player with the highest value
			if(card1.getValue() > card2.getValue()) {
				player1.incrementScore();
//printed the winner of each round to the console or printed if it was a tie
				System.out.println(player1.getName()+ " Wins this round!");
				System.out.println("");
			} else if (card2.getValue() > card1.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " Wins this round!");
				System.out.println("");
			} else {
				System.out.println("This round is a tie!");
			}	System.out.println("");
		}
//printed the final scores to the console with the names and the name of the winner, or the game is a draw if it was a tie.
		System.out.println("");
		System.out.println("THE FINAL SCORES ARE!!!");
		System.out.println("");
		System.out.println(player1.getName() + ": " + player1.getScore());
		System.out.println(player2.getName() + ": " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " is the WINNER!!");
		}	else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " is the WINNER!!");
		} else {
			System.out.println("The game is a draw.");
		}
	 


		
		
		}// end of main
		
		
}// end of class