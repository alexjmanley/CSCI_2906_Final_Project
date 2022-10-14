package capstone;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label; 
import javafx.scene.control.TextField; 

public class Login extends Pane {
	Label label = new Label("Password"); 
	TextField tfEnter = new TextField(); 
	
	Login(){
		label.setLayoutX(200);
		label.setLayoutY(260);
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 30));
		label.setTextFill(Color.WHITE);
		
		tfEnter.setLayoutX(400);
		tfEnter.setLayoutY(265);
		
		this.getChildren().addAll(label, tfEnter); 
		this.setStyle("-fx-background-color: BLUE");
		
	}
}
