package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameMainApplication extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = FXMLLoader.load(GameMainApplication.class.getResource("gameboard.fxml"));
		
		Scene scene = new Scene(parent);
		
		stage.setScene(scene);
		
		stage.setTitle("Tick_Tack_Toe!");
		stage.show();
		
	}

}
