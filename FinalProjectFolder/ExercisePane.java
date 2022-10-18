package capstone;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.util.Calendar;
import java.util.Date;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.text.SimpleDateFormat; 

public class ExercisePane extends Pane{

	Button back = new Button("Back");
	Date startDate1 = null; 
	int weeksToGoal = 0; 
	String training = null; 
	String cardio = null; 
	Label routine = null; 
	
	ExercisePane(){

	}
	
	public void buildPane() {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
		Label startDate = new Label("Start Date: " + format.format(startDate1));
		startDate1.setDate(weeksToGoal * 7); 
		Label endDate = new Label("End Date: " + format.format(startDate1));
		
		switch (training) {
			case "Body Building ": 
				break; 
			case "Calisthenics ":
				break;
			case "Powerlifting ":
				break; 
			case "Weightlifting ":
				break; 
		}
		
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
	public String bodyBuilding() { 
		String training = ""
				+ "Week 1\n"
				+ "Day 1\n "
				+ "Dumbell Incline Press 4x8  RPE 8\n"
				+ "Pull Downs            4x8  RPE 8\n"
				+ "Over Head Press       4x8  RPE 8\n"
				+ "Cable Rows            4x8  RPE 8\n"
				+ "Dumbell Curls         3x12 RPE 8\n"
				+ "Tricep Pushdown       3x12 RPE 8\n"
				+ "\n"
				+ "Day 2\n "
				+ "Hack Squat            4x8  RPE 8\n"
				+ "Back Extension        4x8  RPE 8\n"
				+ "Leg Extension         3x12 RPE 8\n"
				+ "Leg Curl              3x12 RPE 8\n"
				+ "Calf Raise            3x12 RPE 8\n"
				+ "Roman Chair Sit Up    3x12 RPE 8\n"
				+ "\n"
				+ "";
		return training; 
	}
	
}