package ProjectContents;

public class App {
	//Created by Paul C. Willis for Promineo Tech 
	public static void main(String[] args) {
		//Creates new deck
		Deck deck = new Deck();
		
		//Creates new players and sets their names
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		//Shuffles the deck
		deck.shuffle();
		
		//Each player takes a turn drawing to the whole deck is dealt
		for(int index = 0; index < 52; index++) {
			if(index % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		//local value variables to be able to compare the values of each round of cards flipped over
		int value1;
		int value2;
		
		//Players flip cards simultaneously, comparing their values (26 times)
		//The higher value earns a point for the player, equal values are not counted (draw)
		for(int index = 0; index < 26; index++) {
			value1 = player1.flip().value;
			value2 = player2.flip().value;
			if(value1 > value2) {
				player1.incrementScore();
			} else if(value2 > value1){
				player2.incrementScore();
			}
		}
		
		//Prints result of the game
		System.out.println(player1.name + " score: " + player1.score);
		System.out.println(player2.name + " score: " + player2.score);
		if(player1.score > player2.score) {
			System.out.println("Winner: " + player1.name);
		} else if(player2.score > player1.score) {
			System.out.println("Winner: " + player2.name);
		} else {
			System.out.println("Draw!");
		}
	}

}
