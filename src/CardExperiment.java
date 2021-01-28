import java.util.Scanner;

public class CardExperiment {
    public static void main(String[] args) {
        //Datatype  variable name    calling the constructor and passing in System.in
        Scanner     keyboard       = new Scanner(System.in);
        Card        aceOfSpades    = new Card("ace","spades");
        Card        jesseOfMid     = new Card("ten","Hearts");

//        jesseOfMid.setSuit("hearts");  // valid input
//        jesseOfMid.setSuit("Diamonds");    //invalid input
        System.out.printf("%s is a %s card%n",aceOfSpades, aceOfSpades.getCardColour());
        System.out.printf("%s is a %s card%n",jesseOfMid, jesseOfMid.getCardColour());

    }
}
