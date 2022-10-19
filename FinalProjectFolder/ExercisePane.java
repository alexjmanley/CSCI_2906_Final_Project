package capstone;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import java.util.Calendar;
import java.util.Date;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.text.SimpleDateFormat; 
import javafx.scene.control.ScrollBar;

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
			case "Body Building": routine = new Label(bodyBuilding()); 
				break; 
			case "Calisthenics": System.out.println("cal"); 
				break;
			case "Powerlifting": System.out.println("Pow");
				break; 
			case "Weightlifting": System.out.println("weight");
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
		
		routine.setLayoutX(150);
		routine.setLayoutY(100); 
		routine.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15)); 
		routine.setTextFill(Color.WHITE); 
		
		ScrollBar sb = new ScrollBar(); 
		sb.setOrientation(Orientation.VERTICAL);
		sb.setLayoutX(700);
		sb.setLayoutY(100);
		sb.valueProperty().addListener(ov -> 
				routine.setLayoutY(sb.getValue() * routine.getHeight() / sb.getMax()));
		
		this.setStyle("-fx-background-color: BLUE");
		this.getChildren().addAll(back, startDate, endDate, routine, sb);
	}
	public String bodyBuilding() { 
		String schedule = ""; 
		for (int i = 1; i <= weeksToGoal; i++) {
			String week = "Week " + i + "\n\nMonday\nBench Press 4x8 RPE 8\nPull Down 4x8 RPE 8\n"
					+ "Dumbell Overhead Press 4x8 RPE 8\nDumbell Row 4x8 RPE 8\nTricep Pushdown 3x12 RPE 7"
					+ "\nPreacher Curls 3x12 RPE 7\n\nTuesday\nHack Squat 4x8 RPE 8\nBack Extension 4x8 RPE 8\n"
					+ "Sit Ups with Weight 3x12 RPE 7\n" + cardio + " 20 Minutes HR 130"
				    + "\n\nThursday\nIncline Dumbell Press 4x8 RPE 8\n"
					+ "Barbell Row 4x8 RPE 8\nSide Lateral Raise 4x8 RPE 8\nSingle Arm Pull Down 4x8 RPE 8\n"
					+ "Skull Crushers 3x12 RPE 7\nBarbell Curls 3x12 RPE 7\n\n"
					+ "Friday\nGoblit Squat 4x8 RPE 8\nHamstring Curl 4x8 RPE 8\n"
					+ "Leg Raises 3x12 RPE 7\n" + cardio + " 20 Minutes HR 130\n\n";
			schedule = schedule + week; 
		}
		return schedule; 
	}
	
}