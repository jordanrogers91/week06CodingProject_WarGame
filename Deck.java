package week_06CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
//Fields: 
	List<Card> cards = new ArrayList<Card>();
// constructor that populates the deck with 52 cards.
	public Deck() {
		
		String [] numbers = { "Two of ", "Three of ", "Four of ", "Five of ", "Six of ", "Seven of ", "Eight of ", "Nine of ", "Ten of ", "Jack of ", "Queen of ", "King of ", "Ace of "};
		String [] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		cards = new ArrayList<>();
			for(int i = 0; i < suits.length; i++) {
				for (int j = 0; j < numbers.length; j++) {
					String  cardName = numbers[j] + suits[i];
					Card card = new Card(j + 2 , cardName);
					cards.add(card);
				}
			}
		}
	// getter and setter
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	//method to shuffle the deck
	public void shuffle() {
		Collections.shuffle(this.cards);
		}
	//method to draw a card
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
	//method to describe the cards
	public void describe() {
		for(Card card : this.cards) {
			card.describe();	
		}
		
	}

		
}


	
