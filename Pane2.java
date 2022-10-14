package capstone;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Label; 
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox; 
import javafx.scene.control.Button; 

public class Pane2 extends GridPane {
	Label password = new Label("New Password"); 
	TextField tfPassword = new TextField(); 
	
	Label gender = new Label("Gender"); 
	HBox paneForRadioButtons = new HBox(10);
	RadioButton rbMale = new RadioButton("Male");
	RadioButton rbFemale = new RadioButton("Female");
	ToggleGroup group = new ToggleGroup(); 
	Label age = new Label("Age"); 
	TextField tfAge = new TextField(); 
	Label weight = new Label("Weight "); 
	TextField tfWeight = new TextField("lbs"); 
	Label goalWeight = new Label("Goal Weight ");
	TextField tfGoalWeight = new TextField("lbs"); 
	Label height = new Label("Height ");
	ComboBox<String> cboHeight = new ComboBox<>(); 
	
	Label trainingStyle = new Label("Training Style ");
	ComboBox<String> cboTraining = new ComboBox<>();  
	Label cardio = new Label("Cardio ");
	ComboBox<String> cboCardio = new ComboBox<>(); 
	
	Button back = new Button("Back"); 
	Button next = new Button("Next"); 
	
	Pane2(){
		this.setStyle("-fx-background-color: BLUE");
		this.setAlignment(Pos.TOP_CENTER);
		this.setPadding(new Insets(11, 12, 13, 14));
		this.setHgap(80);
		this.setVgap(30);
		
		Label[] labelFont = {password, gender, age, weight, goalWeight, height, trainingStyle, cardio};
		for(int i = 0; i < labelFont.length; i++) {
			labelFont[i].setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 30));
			labelFont[i].setTextFill(Color.WHITE);
		}
		
		tfWeight.setStyle("-fx-text-inner-color: gray");
		tfGoalWeight.setStyle("-fx-text-inner-color: gray");
		
		paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
		paneForRadioButtons.getChildren().addAll(rbMale, rbFemale);
		rbMale.setToggleGroup(group);
		rbFemale.setToggleGroup(group);
		rbMale.setSelected(true);
		rbMale.setStyle("-fx-text-fill: white");
		rbFemale.setStyle("-fx-text-fill: white");
		rbMale.setFont(Font.font("Ariel", FontWeight.BOLD, FontPosture.REGULAR, 20));
		rbFemale.setFont(Font.font("Ariel", FontWeight.BOLD, FontPosture.REGULAR, 20));
		
		int feet = 4;
		int inch = 7;
		while (feet < 7) {
			cboHeight.getItems().add(feet + "ft " + inch + "in");
			inch++; 
			if(inch % 12 == 0) {
				inch = 0;
				feet++;
			}
		}
		cboHeight.setValue(5 + "ft " + 9 + "in");
		
		cboTraining.getItems().addAll("Body Building ","Calisthenics ", "Powerlifting ", "Weightlifting ");
		cboTraining.setValue("Calisthenics "); 
		
		cboCardio.getItems().addAll("Walking ", "Swimming ", "Running ", "Biking ");
		cboCardio.setValue("Walking "); 
		
		back.setPrefHeight(40);
		back.setPrefWidth(80);
		back.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
		
		next.setPrefHeight(40);
		next.setPrefWidth(80);
		next.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
		
		this.add(password, 0, 0);
		this.add(tfPassword, 1, 0);
		this.add(gender, 0, 1);
		this.add(paneForRadioButtons, 1, 1);
		this.add(age, 0, 2); 
		this.add(tfAge, 1, 2);
		this.add(weight, 0, 3);
		this.add(tfWeight, 1, 3);
		this.add(goalWeight, 0, 4);
		this.add(tfGoalWeight, 1, 4);
		this.add(height, 0, 5);
		this.add(cboHeight, 1, 5);
		this.add(trainingStyle, 0, 6);
		this.add(cboTraining, 1, 6);
		this.add(cardio, 0, 7);
		this.add(cboCardio, 1, 7);
		this.add(back, 0, 8);
		this.add(next, 1, 8);
		
	}
}