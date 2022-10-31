package capstone;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar; 
import javafx.scene.control.Label;

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
		
		Label howTo1 = new Label("How do I use the Nutrition Page?");
		howTo1.setLayoutX(100);
		howTo1.setLayoutY(100);
		howTo1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
		howTo1.setTextFill(Color.WHITE);
		
		Label howToUse = new Label("*Enter how many calories you eat each day then press Calculate to "
				+ "show \nhow many calories you ate in the week");
		howToUse.setLayoutX(125);
		howToUse.setLayoutY(150); 
		howToUse.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15)); 
		howToUse.setTextFill(Color.WHITE); 
		
		Label howTo2 = new Label("How do I use the Rest Page?");
		howTo2.setLayoutX(100);
		howTo2.setLayoutY(200);
		howTo2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
		howTo2.setTextFill(Color.WHITE);
		
		Label howToUse1 = new Label("*Enter how many hours of sleep you get each day then press Calculate to "
				+ "show \nhow many hours you sleep in the week");
		howToUse1.setLayoutX(125);
		howToUse1.setLayoutY(250); 
		howToUse1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15)); 
		howToUse1.setTextFill(Color.WHITE); 
		
		Label howTo3 = new Label("How do I use the Exercise Page?"); 
		howTo3.setLayoutX(100);
		howTo3.setLayoutY(300);
		howTo3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
		howTo3.setTextFill(Color.WHITE);
		
		Label howToUse2 = new Label("*4x8 stands for 4 sets of 8 ex. Do 8 repetitions of the Exercise then rest"
				+ "\nrepeat this 3 more times. \n"
								  + "*RPE stands for Rate of Perceived Exertion, ex. \n1-2 Very Light Intensity"
								  + "\n3-4 Light Intensity\n5-6 Moderate Intensity\n7-8 Vigorous Intensity\n"
								  + "9-10 Maximum Intensity");
		howToUse2.setLayoutX(125);
		howToUse2.setLayoutY(350);
		howToUse2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15));
		howToUse2.setTextFill(Color.WHITE);
		
		this.setStyle("-fx-background-color: BLUE");
		this.getChildren().addAll(back, sb, howTo1, howToUse, howTo2, howToUse1, howTo3, howToUse2);
	}
}