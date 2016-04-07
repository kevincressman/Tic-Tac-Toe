package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import game.Game.*;

public class gameboardController {
	Game tic = new Game();
	
	

    @FXML
    private ImageView imgMove1;

    @FXML
    private ImageView imgMove2;

    @FXML
    private ImageView imgMove3;

    @FXML
    private ImageView imgMove4;

    @FXML
    private ImageView imgMove5;

    @FXML
    private ImageView imgMove6;

    @FXML
    private ImageView imgMove7;

    @FXML
    private ImageView imgMove8;

    @FXML
    private ImageView imgMove9;

    @FXML
    private Label lblWinner;

    @FXML
    private Button btnRestart;

  
    
    
    Image imgX = new Image("http://fc07.deviantart.net/fs71/i/2010/049/4/e/The_Letter_X_by_xelenelunny.jpg");
    Image imgO = new Image("http://www.westonsigns.com/images/P/WSCL1_O_FIRE-01.jpg");
    @FXML
    void restartClicked(ActionEvent event) {
    	
    }

    @FXML
    void setImage(MouseEvent event) {
    	Object source = event.getSource();
    	if(source instanceof ImageView){
    		ImageView iv = (ImageView) source;
    		System.out.println(iv.getId());
    		getCoordinate(iv.getId().toString());
    		
    		}
    			
    		
    		//is move valid?
    		
    		
    		//only if things are valid and no winner
    		String player = tic.getCurentPlayer();
    			if (player == "Player One"){
    				((ImageView) source).setImage(imgX);
    				tic.switchPlayer();
    			}
    			else {
    				((ImageView) source).setImage(imgO);
    			tic.switchPlayer();
    			}
    			
    			//check for winner
    			
    	}
    
    
    public void RestartGame(){
    	tic.reset();
    	
    }
    public String getCoordinate(String s){
    	String coordinate = "";
		switch (s){
		case "imgMove1":
			coordinate = "[0][0]"; 
			break;
		case "imgMove2":
			coordinate = "[1][0]";
			break;
		case "imgMove3":
			coordinate = "[2][0]";
			break;
		case "imgMove4":
			coordinate = "[1][0]";
			break;
		case "imgMove5":
			coordinate = "[1][1]";
			break;
		case "imgMove6":
			coordinate = "[1][2]";
			break;
		case "imgMove7":
			coordinate = "[2][0]";
			break;
		case "imgMove8":
			coordinate = "[2][1]";
			break;
		case "imgMove9":
			coordinate = "[2][2]";
			break;
			
		}
		return coordinate;
    }
}
