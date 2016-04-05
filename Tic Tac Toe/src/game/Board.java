package game;

import game.Game;

public class Board {
	
	MoveResult result;
	String currentPlayer;
	 

	String board[][] = new String[3][3];
	
	public Board(int row, int col){
		
		
		board[row][col]= "-";
		}
	public MoveResult makeMove(int row, int col){
		
		if (board[row][col]== "-"){
			return MoveResult.InvalidMove;	
		}
		else if (currentPlayer == "Player One"){
			return MoveResult.ValidMove;
		}
		else return MoveResult.ValidMove;
		
	
		
	}
	public void moveSets(){
		switch (result){
		case InvalidMove:
			System.out.println("Invalid move, try again");
			break;
		case ValidMove:
			//controller logic to place an image
			Game.switchPlayer();
			break;
		case PlayerWon:
			System.out.println(currentPlayer+"has won the game");
			break;
		case TieGame:
			System.out.println("Game is a tie");
			break;
			
		}
	}
}
