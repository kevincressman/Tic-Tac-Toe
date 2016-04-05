package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class gameboardController {

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
    	}
    }

}
