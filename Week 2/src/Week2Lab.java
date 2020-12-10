
public class Week2Lab {

	public static void main(String[] args) {
		//Week 2 steps 1 - 4
		boolean isHotOutside = true;
		boolean	isWeekday = false;
		boolean	hasMoneyInPocket = false;
		double costOfMilk = 3.0;
		double moneyInWallet = 7.23;
		int thirstLevel = 4;
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk;
		

		

	}

}
