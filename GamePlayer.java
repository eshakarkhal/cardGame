package cardgameweek4;
/**
 * A class to handle the user interaction for the Card
 * project. Contains a main method that generates a card hand
 * and then iterates over it to print its contents to the console.
 * 
 * @author dancye, 2019
 */
public class GamePlayer {
	public static void main(String[] args) {
		CardHand deck = new CardHand();
		deck.createDeck();
		for (Card card : deck.getCards()) {
			card.displayCard();
		}
	}
}