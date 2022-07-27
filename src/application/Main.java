package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	  @Override
	    public void start(Stage primaryStage) throws IOException {
	    primaryStage.setTitle("M.M");
	    Parent root =   FXMLLoader.load(getClass().getResource("test.fxml"))  ;
	    Scene M =new Scene(root);
	    primaryStage.setScene(M);
	    primaryStage.show();
	    primaryStage.setResizable(false);
	       
	    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
