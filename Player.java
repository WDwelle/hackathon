import java.util.*;

public class Player extends Deck implements Game{
    public String name;
    public int score;
    public ArrayList<Card> hand;
    public static int numPlayers;

    public Player(){
        this.name = "Player";
        this.numPlayers++;
    }
    public Player(String name){
        this.name = name;
        this.numPlayers++;
    }

    public void setHand(Card newCard){
        hand.add(newCard);
    }
}