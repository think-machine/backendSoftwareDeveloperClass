package ProjectContents;

public class Card {
	//for card values 2 - 14 (or 2 - Ace)
	int value;
	//for card name like Ace of Diamonds or Two of Hearts
	String name;
	
	Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	//sets the value of the card
	public void setValue(int value) {
		this.value = value;
	}
	//returns the value of the card
	public int getValue() {
		return this.value;
	}
	//sets the name of the card
	public void setName(String name) {
		this.name = name;
	}
	//returns the name of the card
	public String getName() {
		return this.name;
	}
	public void describe() {
		System.out.println(name);
	}

	@Override
	public String toString() {
		return "Card [value=" + value + ", name=" + name + "]";
	}
}
