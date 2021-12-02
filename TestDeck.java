public class TestDeck {

	public static void main(String[] args) {
		
		Deck myDeck = new Deck();
		for (Card card: myDeck.getCards()) {
			card.showCard();
		}
		
		Player player1 = new Player("Jim");
        Player player2 = new Player("Jane");
		player1.newGame();

		player1.hit();
        player1.hit();
        player1.hit();
        player1.hit();
        player2.hit();
        player2.hit();
        player2.hit();
        player2.hit();
	}
}