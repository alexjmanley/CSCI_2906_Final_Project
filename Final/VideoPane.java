package capstone;

import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar; 

public class VideoPane extends Pane{
	Button back = new Button("Back"); 
	
	VideoPane(){
		back.setPrefHeight(50);
		back.setPrefWidth(100);
		back.setLayoutX(35);
		back.setLayoutY(20);
		back.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
		
		ScrollBar sb = new ScrollBar(); 
		sb.setOrientation(Orientation.VERTICAL);
		sb.setLayoutX(700);
		sb.setLayoutY(20);
		sb.setPrefSize(20, 600);
		// add sb setOnAction after adding all video
		
		this.setStyle("-fx-background-color: BLUE");
		this.getChildren().addAll(back, sb);
	}
}
