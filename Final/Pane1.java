package capstone;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 

public class Pane1 extends Pane{
	Label label = null;
	Button newUser = null;  
	
	Pane1() {
		label = new Label("GOFitness"); 
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.REGULAR, 75));
		label.setLayoutX(190);
		label.setLayoutY(50);
		label.setTextFill(Color.WHITE);
		
		newUser = new Button("Start");
		newUser.setPrefHeight(100);
		newUser.setPrefWidth(200);
		newUser.setLayoutX(260);
		newUser.setLayoutY(300);
		newUser.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.REGULAR, 30));
		
		this.setStyle("-fx-background-color: BLUE");  
		this.getChildren().addAll(label, newUser); 
	
	}
}