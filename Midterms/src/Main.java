import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Creating Deck

        ArrayList<Card> cardList = new ArrayList<Card>();
        cardList.add(new Card("Kobe Bryant"));
        cardList.add(new Card("Shaquille O' Neal"));
        cardList.add(new Card("Tim Duncan"));
        cardList.add(new Card("Allen Iverson"));
        cardList.add(new Card("Kevin Garnett"));
        cardList.add(new Card("Steve Nash"));
        cardList.add(new Card("Dirk Nowitzki"));
        cardList.add(new Card("Ray Allen"));
        cardList.add(new Card("Paul Pierce"));
        cardList.add(new Card("Tracy McGrady"));
        cardList.add(new Card("Yao Ming"));
        cardList.add(new Card("LeBron James"));
        cardList.add(new Card("Dwayne Wade"));
        cardList.add(new Card("Carmelo Anthony"));
        cardList.add(new Card("Tony Parker"));
        cardList.add(new Card("Manu Ginobili"));
        cardList.add(new Card("Jason Kidd"));
        cardList.add(new Card("Dwight Howard"));
        cardList.add(new Card("Vince Carter"));
        cardList.add(new Card("Chris Webber"));
        cardList.add(new Card("Amar'e Stoudemire"));
        cardList.add(new Card("Pau Gasol"));
        cardList.add(new Card("Jermaine O' Neal"));
        cardList.add(new Card("Ben Wallace"));
        cardList.add(new Card("Gilbert Arenas"));
        cardList.add(new Card("Chauncey Billups"));
        cardList.add(new Card("Shawn Marion"));
        cardList.add(new Card("Chris Paul"));
        cardList.add(new Card("Deron Williams"));
        cardList.add(new Card("Michael Redd"));

        //Shuffling Deck

        Random random=new Random();
        int[] numbers=new int[30];
        CardStack stack = new CardStack(30);

        for(int i = 0; i < numbers.length; i++) {
            numbers[i]= random.nextInt(30);

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            stack.push(cardList.get(numbers[i]));
        }

        //Looped Turn of Player

        System.out.print("List of cards that the player is currently holding:\n");
        stack.printStack();
        System.out.print("\nNumber of remaining cards in the player deck: " + cardList.size() + "\n");
        System.out.print("\nNumber of cards in the discarded pile: " + (30 - cardList.size()) + "\n");

        int i = 30;
        while (i > 0)
        {
            int decisionNumber = random.nextInt(3);

            if (decisionNumber == 0) { //Draw x cards
                System.out.print("\nDrawing Card: " + stack.peek() + "\n");
            }
            else if (decisionNumber == 1) { //Discard x cards
                System.out.print("\nDiscarding Card: " + stack.peek() + "\n");
                stack.pop();
                i--;
            }
            else { // Retrieve Discarded x cards
                if (i < 30) {
                    stack.push(cardList.get(numbers[i]));
                    System.out.print("\nRetrieving Discarded Card: " + stack.peek() + "\n");
                    i++;
                }
                else {
                    System.out.print("\nRetrieving Discarded Card: None");
                }
            }

            System.out.print("\nList of cards that the player is currently holding:\n");
            stack.printStack();
            System.out.print("\nNumber of remaining cards in the player deck: " + i + "\n");
            System.out.print("\nNumber of cards in the discarded pile: " + (30 - i) + "\n");
        }
    }
}