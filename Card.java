package week_06CodingProject;

public class Card {
	
	 String cardName; 
	 int value;
	
	public Card(int value, String cardName){
		this.cardName = cardName;
		this.value = value;	
	}

	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public void describe() {
		System.out.println(this.cardName + " - " + this.value);
	}
}
