package ProjectContents;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//Creates a list of cards to build out a hand
	private List<Card> hand = new ArrayList<>();
	
	//Defines the fields for a player
	public int score;
	public String name;
	
	//Default constructor, initializes score to 0
	Player(){
		score = 0;
	}
	
	//Player constructor setting name
	Player(String name){
		score = 0;
		this.name = name;
	}
	
	//Prints out a player's name, score, and all the cards in their hand
	public void describe() {
		System.out.println("Player name: " + name + " Player score: " + score + " Hand: ");
		for(Card card : hand) {
			card.describe();
		}
		
	}
	
	//returns (and removes) the top card from the player's hand
	public Card flip() {
		Card top = hand.get(0);
		hand.remove(0);
		return top;
	}
	
	//Adds another card from the deck to the player's hand by calling the draw method
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//Adds 1 to the player's score
	public void incrementScore () {
		score++;
	}
}
