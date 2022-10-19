package capstone;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RestPane extends Pane{
	
	Button back = new Button("Back"); 
	Date startDate1 = null; 
	int weeksToGoal = 0; 
	
	RestPane(){

	}
	public void buildPane() {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
		Label startDate = new Label("Start Date: " + format.format(startDate1));
		startDate1.setDate(weeksToGoal * 7); 
		Label endDate = new Label("End Date: " + format.format(startDate1));
		
		back.setPrefHeight(50);
		back.setPrefWidth(100);
		back.setLayoutX(35);
		back.setLayoutY(20);
		back.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
		
		startDate.setLayoutX(150);
		startDate.setLayoutY(27);
		startDate.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 30));
		startDate.setTextFill(Color.WHITE);
		
		endDate.setLayoutX(427);
		endDate.setLayoutY(27);
		endDate.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 30));
		endDate.setTextFill(Color.WHITE);
		
		this.setStyle("-fx-background-color: BLUE");
		this.getChildren().addAll(back, startDate, endDate); 

	}
	
}