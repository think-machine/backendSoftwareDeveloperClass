package ProjectContents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//List of cards to build out a 52 card deck
	private List<Card> cards = new ArrayList<>();
	
	//Defines the suits of cards
	private List<String> suit = List.of("Hearts", "Spades", "Clubs", "Diamonds");
	
	//Defines the ranks in the card names
	private List<String> cardRank = List.of("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace");

	//Constructor
	Deck(){
		//Creates a card in the deck for every combination of rank and suit, including the value
		for(String suits : suit) {
			for(int index = 0; index < cardRank.size(); index++) {
				String name = String.format("%s of %s", cardRank.get(index), suits);
				int value = index + 2;
				cards.add(new Card(value, name));
			}
		}
	}
	
	@Override
	public String toString() {
		return "" + cards;
	}
	
	//This uses the imported collections utility to randomly shuffle the deck when called
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//Removes the top card on the deck and returns it to the calling method
	public Card draw() {
		Card top = cards.get(0);
		cards.remove(0);
		return top;
	}
	
}
