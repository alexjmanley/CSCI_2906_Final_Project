package capstone;

import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;

public class Pane3 extends Pane{
	Button exercise = new Button("Exercise");
	Button nutrition = new Button("Nutrition");
	Button rest = new Button("Rest");
	Button logout = new Button("Reset");
	Button ExerciseList = new Button("Help");
	
	Pane3(){
		exercise.setPrefHeight(100);
		exercise.setPrefWidth(200);
		exercise.setLayoutX(260);
		exercise.setLayoutY(50);
		exercise.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.REGULAR, 30));
		
		nutrition.setPrefHeight(100);
		nutrition.setPrefWidth(200);
		nutrition.setLayoutX(260);
		nutrition.setLayoutY(225);
		nutrition.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.REGULAR, 30));
		
		rest.setPrefHeight(100);
		rest.setPrefWidth(200);
		rest.setLayoutX(260);
		rest.setLayoutY(400);
		rest.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.REGULAR, 30));
		
		logout.setPrefHeight(50);
		logout.setPrefWidth(100);
		logout.setLayoutX(490);
		logout.setLayoutY(550);
		logout.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
		
		ExerciseList.setPrefHeight(50);
		ExerciseList.setPrefWidth(100);
		ExerciseList.setLayoutX(130);
		ExerciseList.setLayoutY(550);
		ExerciseList.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
		
		this.setStyle("-fx-background-color: BLUE");
		this.getChildren().addAll(exercise, nutrition, rest, logout, ExerciseList);
		
	}

}
