package game;

public class Game {

		static String currentPlayer;
		Board board = new Board(3, 3);
		
	
		public static void switchPlayer(){
		String player1 = "Player One";
		String player2 = "Player Two";
		
	
		if (currentPlayer == player1){
			currentPlayer = player2;}
		else currentPlayer = player1;
				
		
	}

}
