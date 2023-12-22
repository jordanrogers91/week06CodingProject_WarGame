package week_06CodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
//fields
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
//constructor 
	public Player (String name) {
		this.name = name;
		score = 0;
	}
//method to describe the players
	public void describe() {
		System.out.println("Player " + this.name + "has the following deck: ");
		for (Card card : hand ) {
			card.describe();
		}
	}
//method to remove the top card from the players hand
	public Card flip() {
		return hand.remove(0); 
	}
//method to draw a card from the deck and add it to the players hand
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
//increase the players score
	public void incrementScore() {
		score++;
	}
//getter and setter for score	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}

}
