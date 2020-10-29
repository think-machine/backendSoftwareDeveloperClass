//Step 2: Create class named 'App'
public class App {

	public static void main(String[] args) {
		//Step 3: Create variables
		double itemPrice = 12.99;
		double walletStart = 43.37;
		int friends = 343;
		int age = 21;
		String firstName = "Paul";
		String lastName = "Willis";
		char middleInitial = 'C';

		
		//Step 4: Create variables from operations
		double walletFinal = walletStart - itemPrice;
		int friendsPerYear = friends / age;
		String fullName = firstName + " "+ middleInitial + ". " + lastName;
		
		//Step 5: Print all values of all variables with context
		System.out.println("Item price: $" + itemPrice);
		System.out.println("Cash in my wallet: $" + walletStart);
		System.out.println("My total friends: " + friends);
		System.out.println("My age: " + age);
		System.out.println("My first name: " + firstName);
		System.out.println("My last name: " + lastName);
		System.out.println("My middle initial: " + middleInitial);
		
		System.out.println("\nBased on the information provided...");
		
		/*I'm aware that the print format is truncating instead of rounding here, 
		but I'm fine with it for the scope of this project*/
		System.out.printf("If I purchase the item, I'll have $%.2f left in my wallet\n", walletFinal);
		
		//also not rounded accurately, the friends per year truncates the math
		System.out.println("I've gained an average " + friendsPerYear + " friends a year");
		System.out.println("My full name is \"" + fullName + "\"");
	}
}
