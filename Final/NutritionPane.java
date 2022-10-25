package capstone;

import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane; 
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.TextField; 
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.plaf.LabelUI;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NutritionPane extends Pane{
	
	GridPane gpDays = new GridPane();
	Button back = new Button("Back"); 
	Date startDate1 = null; 
	int weeksToGoal = 0; 
	double calories = 0; 
	
	NutritionPane(){

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
		
		DecimalFormat df = new DecimalFormat("#");
		Label calorieGoal = new Label("Weekly Calorie Goal: " + df.format(calories * 7) 
		+ "            Daily Calorie Goal: " + df.format(calories)); 
		calorieGoal.setLayoutX(100);
		calorieGoal.setLayoutY(125); 
		calorieGoal.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20)); 
		calorieGoal.setTextFill(Color.WHITE);
		
		Label[] gpLabels = {new Label("Previous Week Intake: "), new Label("Enter calories eaten each day"),
				new Label("Sunday"), new Label("Monday"), new Label("Tuesday"), new Label("Wednsday"),
				new Label("Thursday"), new Label("Friday"), new Label("Saturday")}; 
		for (int i = 0; i < gpLabels.length; i++) {
			gpLabels[i].setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15));
			gpLabels[i].setTextFill(Color.WHITE);
		}
		gpDays.setStyle("-fx-background-color: BLUE"); 
		gpDays.setAlignment(Pos.CENTER);
		gpDays.setHgap(10);
		gpDays.setVgap(10);
		gpDays.setLayoutX(200); 
		gpDays.setLayoutY(200);
		gpDays.add(gpLabels[0], 0, 0);gpDays.add(gpLabels[1], 0, 1);gpDays.add(gpLabels[2], 0, 2);
		gpDays.add(gpLabels[3], 0, 3);gpDays.add(gpLabels[4], 0, 4);gpDays.add(gpLabels[5], 0, 5);
		gpDays.add(gpLabels[6], 0, 6);gpDays.add(gpLabels[7], 0, 7);gpDays.add(gpLabels[8], 0, 8);
		gpDays.add(new TextField(), 1, 2);gpDays.add(new TextField(), 1, 3);gpDays.add(new TextField(), 1, 4);
		gpDays.add(new TextField(), 1, 5);gpDays.add(new TextField(), 1, 6);gpDays.add(new TextField(), 1, 7);
		gpDays.add(new TextField(), 1, 8);
		
		this.setStyle("-fx-background-color: BLUE");
		this.getChildren().addAll(back, startDate, endDate, calorieGoal, gpDays); 

	}

}