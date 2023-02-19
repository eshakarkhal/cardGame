package cardgameweek4;
/**
 * a class that models the Card Hand.
 * A Card hand has an array of cards.
 * How can you change the size of the hand? how big is it right now?
 * 
 * @suthor dancye, 2019.
 */

public class CardHand {
    private final int handSize = 60;
    public Card[] cards = new Card[handSize];
    /**
     * Add comments during class to explain what this method does.
     * For every suit, it will loop over the values and create a new card
     * object which is then added to the Card array.
     */
    public void createDeck() {
        int countCards = 0;
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Value value : Card.Value.values())
                cards[countCards++] = (new Card(suit, value));
        } // end outter for
    }// end method

    public Card[] getCards() {
        return cards;
    }
}