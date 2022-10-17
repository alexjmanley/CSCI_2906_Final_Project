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
import java.util.Date; 

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
	 
	Button next = new Button("Next"); 
	
	//variables for calculating calories 
	double vweight = 0;
	double vgoalWeight = 0;
	String vgender = null; 
	double vheight = 0; 
	int vage = 0; 
	double vcalories = 0; 
	int weeksToGoal = 0; 
	String vtraining = null; 
	String vcardio = null; 
	
	Date startDate = null; 
	
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
			cboHeight.getItems().add(feet + "ft " + inch + " in");
			inch++; 
			if(inch % 12 == 0) {
				inch = 0;
				feet++;
			}
		}
		cboHeight.setValue(5 + "ft " + 9 + " in");
		
		cboTraining.getItems().addAll("Body Building ","Calisthenics ", "Powerlifting ", "Weightlifting ");
		cboTraining.setValue("Calisthenics "); 
		
		cboCardio.getItems().addAll("Walking ", "Swimming ", "Running ", "Biking ");
		cboCardio.setValue("Walking "); 
		
		next.setPrefHeight(40);
		next.setPrefWidth(80);
		next.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
		
		this.add(gender, 0, 0);
		this.add(paneForRadioButtons, 1, 0);
		this.add(age, 0, 1); 
		this.add(tfAge, 1, 1);
		this.add(weight, 0, 2);
		this.add(tfWeight, 1, 2);
		this.add(goalWeight, 0, 3);
		this.add(tfGoalWeight, 1, 3);
		this.add(height, 0, 4);
		this.add(cboHeight, 1, 4);
		this.add(trainingStyle, 0, 5);
		this.add(cboTraining, 1, 5);
		this.add(cardio, 0, 6);
		this.add(cboCardio, 1, 6);
		this.add(next, 1, 7);
		
	}
	
	public void populateVariables() {
		this.vweight = Double.parseDouble(tfWeight.getText()) / 2.205; 
		this.vgoalWeight = Double.parseDouble(tfGoalWeight.getText()) / 2.205;
		if (this.rbFemale.isSelected() == true)
			this.vgender = "Female"; 
		else 
			this.vgender = "Male";
		String hold = this.cboHeight.getValue();
		char a = hold.charAt(0);
		String b = hold.substring(4, 6).trim(); 
		int foot = Integer.parseInt(String.valueOf(a)) * 12;  
		int inch = Integer.parseInt(b); 
		this.vheight = (foot + inch) * 2.54; 
		this.vage = Integer.parseInt(tfAge.getText());
		this.vcalories = calculateCalories(vweight, vgender, vheight, vage); 
		if (vweight > vgoalWeight) {
			vcalories = vcalories - 500; 
			while (vweight > vgoalWeight) {
				vweight = vweight - 0.5;
				weeksToGoal++; 
			}
		} else if (vweight < vgoalWeight) {
			vcalories = vcalories + 500; 
			while (vweight < vgoalWeight) {
				vweight = vweight + 0.5; 
				weeksToGoal++; 
			}
		}
		this.vtraining = this.cboTraining.getValue(); 
		this.vcardio = this.cboCardio.getValue(); 
		
		startDate = new Date();
		
		System.out.println(this.vage + " " + this.vcalories + " " + this.vcardio + " " + this.vgender 
				+ " " + this.vgoalWeight + " " + this.vheight + " " + this.vtraining + " " + this.vweight);
		
	}
	public static double calculateCalories(double weight, String gender, double height, int age) {
		double calories = 0; 
		if (gender.equalsIgnoreCase("Female"))
			calories = (447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age)) * 1.55;
		else 
			calories = (88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age)) * 1.55;
		return calories;
	}
}