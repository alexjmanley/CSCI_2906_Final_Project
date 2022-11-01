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
		try {
		Object startDate2 = startDate1.clone(); 
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
		Label startDate = new Label("Start Date: " + format.format(startDate2));
		((Date) startDate2).setDate(weeksToGoal * 7); 
		Label endDate = new Label("End Date: " + format.format(startDate2));
		
		switch (training) {
			case "Body Building": routine = new Label(bodyBuilding()); 
				break; 
			case "Calisthenics": routine = new Label(calisthenics()); 
				break;
			case "Powerlifting": routine = new Label(powerlifting());
				break; 
			case "Weightlifting": routine = new Label(weightlifting());
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
		sb.setLayoutY(20);
		sb.setPrefSize(20, 600);
		sb.valueProperty().addListener(ov -> 
				routine.setLayoutY((sb.getValue() * - routine.getHeight() / sb.getMax()) + 100));
		sb.valueProperty().addListener(ov -> 
				back.setLayoutY((sb.getValue() * - routine.getHeight() / sb.getMax()) + 20));
		sb.valueProperty().addListener(ov ->
				startDate.setLayoutY((sb.getValue() * - routine.getHeight() / sb.getMax()) + 27));
		sb.valueProperty().addListener(ov -> 
				endDate.setLayoutY((sb.getValue() * - routine.getHeight() / sb.getMax()) + 27));
		
		this.setStyle("-fx-background-color: BLUE");
		this.getChildren().addAll(back, startDate, endDate, routine, sb);
		}
		catch (IllegalArgumentException ex) {
			this.getChildren().clear(); 
			buildPane(); 
		}
	}
	public String bodyBuilding() { 
		String schedule = ""; 
		for (int i = 1; i <= weeksToGoal; i++) {
			String week = "Week " + i + "\n\nMonday\nBench Press 4x8 RPE 8\nPull Down 4x8 RPE 8\n"
					+ "Dumbbell Overhead Press 4x8 RPE 8\nDumbbell Row 4x8 RPE 8\nTricep Pushdown 3x12 RPE 7"
					+ "\nPreacher Curls 3x12 RPE 7\n\nTuesday\nHack Squat 4x8 RPE 8\nBack Extension 4x8 RPE 8\n"
					+ "Sit Ups with Weight 3x12 RPE 7\n" + cardio + " 20 Minutes HR 130"
				    + "\n\nThursday\nIncline Dumbbell Press 4x8 RPE 8\n"
					+ "Barbell Row 4x8 RPE 8\nSide Lateral Raise 4x8 RPE 8\nSingle Arm Pull Down 4x8 RPE 8\n"
					+ "Skull Crushers 3x12 RPE 7\nBarbell Curls 3x12 RPE 7\n\n"
					+ "Friday\nGoblet Squat 4x8 RPE 8\nHamstring Curl 4x8 RPE 8\n"
					+ "Leg Raises 3x12 RPE 7\n" + cardio + " 20 Minutes HR 130\n\n";
			schedule = schedule + week; 
		}
		return schedule; 
	}
	public String calisthenics() {
		String schedule = "";
		for (int i = 1; i <= weeksToGoal; i++) {
			String week = "Week " + i + "\n\nMonday\nHand stand push up 4x8 RPE 8\nPull Up 4x8 RPE 8\n"
					+ "Dips 4x8 RPE 8\nAussie Pull ups 4x8 RPE 8\nPush ups 3x12 RPE 7"
					+ "\nBarbell Curls 3x12 RPE 7\n\nTuesday\nPistol Squat 4x8 RPE 8\nBody Weight Leg Curl 4x8 RPE 8\n"
					+ "Leg Raises 3x12 RPE 7\n" + cardio + " 20 Minutes HR 130"
				    + "\n\nThursday\nDips 4x8 RPE 8\n"
					+ "Pull ups 4x8 RPE 8\nSide Lateral Raise 4x8 RPE 8\nChin Up 4x8 RPE 8\n"
					+ "Diamond Push up 3x12 RPE 7\nBarbell Curls 3x12 RPE 7\n\n"
					+ "Friday\nPistol Squat 4x8 RPE 8\nBack extensions 4x8 RPE 8\n"
					+ "Leg Raises 3x12 RPE 7\n" + cardio + " 20 Minutes HR 130\n\n";
			schedule = schedule + week; 
		}
		return schedule; 
	}
	public String powerlifting() {
		String schedule = "";
		for (int i = 1; i <= weeksToGoal; i++) {
			String week = "Week " + i + "\n\nMonday\nBench Press 5x5 RPE 8\n"
					+ "Dips 4x8 RPE 8\nPush ups 3x12 RPE 7"
					+ "\n\nTuesday\n" + cardio + " 45 minutes HR 130\n\nWednsday\n"
					+ "Back Squat 5x5 RPE 8\nBody Weight Leg Curl 4x8 RPE 8\n"
					+ "Leg Raises 3x12 RPE 7\n" 
				    + "\nThursday\n" + cardio + " 45 minutes HR 130\n\nFriday\nDeadlift 5x5 RPE 8\n"
					+ "Pull ups 4x8 RPE 8\n"
					+ "Barbell row 3x12 RPE 7\n\n";
			schedule = schedule + week; 
		}
		return schedule; 
	}
	public String weightlifting() {
		String schedule = "";
		for (int i = 1; i <= weeksToGoal; i++) {
			String week = "Week " + i + "\n\nMonday\nSnatch 5x2 RPE 8\n"
					+ "Hip Snatch^OHS 4x2+1 RPE 7\nPush ups 3x12 RPE 7"
					+ "\n\nTuesday\n" + cardio + " 45 minutes HR 130\n\nWednsday\n"
					+ "Back Squat 5x5 RPE 8\nClean 5x2 RPE 8\n"
					+ "Power Jerk 3x5 RPE 7\n" 
				    + "\nThursday\n" + cardio + " 45 minutes HR 130\n\nFriday\nSnatch 5x2 RPE 8\n"
					+ "Pull ups 4x8 RPE 8\n"
					+ "Front Squat 5x5 RPE 7\n\n";
			schedule = schedule + week; 
		}
		return schedule; 
	}
}