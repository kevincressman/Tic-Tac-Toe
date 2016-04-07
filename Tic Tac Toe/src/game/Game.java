package game;

import game.*;

public class Game {

		static String currentPlayer;
		Board board = new Board();
		
	
		public static void switchPlayer(){
		String player1 = "Player One";
		String player2 = "Player Two";
		
	
		if (currentPlayer == player1){
			currentPlayer = player2;}
		else currentPlayer = player1;
				
		
		}
		
		public String getCurentPlayer(){
			return currentPlayer;
		}
		
		public Board reset(){
			Board b = new Board();
			return b;
		}

}
