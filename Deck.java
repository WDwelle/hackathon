import java.util.ArrayList;
import java.util.Random;

public class Deck{

   	private ArrayList<Card> cards;
	
    public Deck() {
        this.cards = new ArrayList<Card>();

        // Populate the cards list -- loop to 52
        for (String name : new String[] {"Hearts", "Clubs", "Diamonds", "Spades"}) {
            for (Integer rank = 1; rank <= 13; rank++) {
                this.cards.add(new Card(name, rank));
            }
        }
    }

    public void hit(){
        Random randNum = new Random();
        int newNum = randNum.nextInt(51) + 1;
        Card card = cards.get(newNum);
        System.out.println(card.name);
        System.out.println(card.suit);
        System.out.println("==============");
    }

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
}