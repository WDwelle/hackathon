import java.util.*;

public interface Game{
    // public ArrayList<Card> deal(int numPlayers){
    //     for(String player : numPlayers){
    //         hand.add.Random(Card);
    //     }
    // }

    // Method to start game?
    default void newGame() {
        System.out.println("Do you want to play a game of blackjack? (y/n) ");
        String response = System.console().readLine();
        char c = response.charAt(0);
        if(c == 'y') {
            // pull card
        } 
        else if( c == 'n') {
            System.out.println("Goodbye!");
        } 
        else {
            System.out.println("Oops. Invalid response.");
        }
    }


    // Method to compare scores
    default String compareScores(int score1, int score2) {
        // if(score1 == score2) {
        //     return "It's a draw.";
        // } else if(score1 > 21) {
        //     return "Player 2 wins.";
        // } else if(score2 > 21) {
        //     return "Player 1 wins.";
        // }
        if(score1 > score2) {
            return "Player 1 wins.";
        } 
        else {
            return "Player 2 wins.";
        }
    }
}