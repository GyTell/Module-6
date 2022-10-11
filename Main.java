//Module 6  Glenney Tello  10/10/2022
package application;

//imports needed
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//adding pane like video demonstration
			Pane b = new Pane();
			Scene scene = new Scene(b,400,400);
			//setting a scene color
			scene.setFill(Color.LIGHTBLUE);
			//Setting the title to Stage. 
		    primaryStage.setTitle("GUI Demo - Glenney Tello");
			//adding a button to welcome user
			Button h = new Button();
			h.setLayoutX(150);
			h.setLayoutY(150);
			//what the button will say
			h.setText("Hello New User");
			b.getChildren().add(h);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		
		
		launch(args);
	}
}
