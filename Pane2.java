package capstone;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Label; 

public class Pane2 extends GridPane {
	Label password = new Label("New Password"); 
	
	Label gender = new Label("Gender"); 
	Label age = new Label("Age"); 
	Label weight = new Label("Weight"); 
	Label goalWeight = new Label("Goal Weight");
	Label height = new Label("Height"); 
	
	Pane2(){
		this.setStyle("-fx-background-color: SKYBLUE");
	}
}
