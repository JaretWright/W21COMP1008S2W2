import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName;
    private String suit;

    /**
     * This constructor takes 2 arguments, one for the face name and
     * one for the suit.  The value of the card assumes that aces 
     * are high and will dynamically establish the card value
     * when the getCardValue() method is run
     * 
     * The constructor must be the same name as the class (including the upper case first letter)
     * The constructor does NOT have a return type
     */
    public Card(String faceName, String suit)
    {
        this.faceName = faceName;
        setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        List<String> validSuits = Arrays.asList("hearts","diamonds","spades","clubs");
        if (validSuits.contains(suit))  // this performs a case sensitive comparison
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " is not valid.  Use one of "+validSuits);
    }

    public String toString()
    {
        return faceName + " of " + suit;
    }
}
