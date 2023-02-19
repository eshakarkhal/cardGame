package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * 
 * @author dancye, 2019
 * 4 - Encapsulation is being used here to bind the functionality and
 * the data together. Whenever any card object calls the display method
 * the method uses the attributes and prints them on the screen.
 *
 * 5 - This class can be inherited by any other class, which can then
 * add or the attributes of this class and can also use polymorphism and can
 * add more functionality to it.
 */
public class Card {
    public enum Suit {
        RED, YELLOW, GREEN, BLUE
    };

    public enum Value {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAW2, DRAW4, WILDCARD
    };

    private final Suit suit;
    private final Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    // Used to Display Card
    public void displayCard() {
        displayValue(value);
        System.out.println(" of " + suit);
    }

    // Used to display Card Value
    public void displayValue(Value card) {
        if (card == Value.ZERO)
            System.out.print("0");
        else if (card == Value.ONE)
            System.out.print("1");
        else if (card == Value.TWO)
            System.out.print("2");
        else if (card == Value.THREE)
            System.out.print("3");
        else if (card == Value.FOUR)
            System.out.print("4");
        else if (card == Value.FIVE)
            System.out.print("5");
        else if (card == Value.SIX)
            System.out.print("6");
        else if (card == Value.SEVEN)
            System.out.print("7");
        else if (card == Value.EIGHT)
            System.out.print("8");
        else if (card == Value.NINE)
            System.out.print("9");
        else if (card == Value.DRAW2)
            System.out.print("Draw Two");
        else if (card == Value.DRAW4)
            System.out.print("Draw Four");
        else
            System.out.print(value);
    }
}