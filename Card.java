import java.util.HashMap;

public class Card{
	
	public String suit;
	private int rank;
	public String name;
	
    public Card(String suit, Integer rank) {
    	this.suit = suit;
    	this.rank = rank;
    	this.name = "";
    	
    	HashMap<Integer, String> names = new HashMap<Integer, String>();
        names.put(1, "Ace");
        names.put(10, "Jack");
        names.put(10, "Queen");
        names.put(10, "King");
            
            
        if (names.get(rank) != null) {
            this.name = names.get(rank);
        }
        else {
            this.name = Integer.toString(rank);
        }
    }
    
    public void showCard() {
        System.out.printf("%s of %s\n", this.name, this.suit);
    }

//===Setters and Getters===//
	public String getSuit() {
		return suit;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
    
}