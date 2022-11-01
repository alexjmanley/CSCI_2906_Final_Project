package capstone;

import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane; 
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar; 
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VideoPane extends Pane{
	Button back = new Button("Back"); 
	
	VideoPane() {
		back.setPrefHeight(50);
		back.setPrefWidth(100);
		back.setLayoutX(35);
		back.setLayoutY(20);
		back.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
		
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
		
		Label[] label = {new Label("Australian Pull Ups"), new Label("Back Extensions"), new Label("Back Squat"),
				new Label("Barbell Curl"), new Label("Barbell Row"), new Label("Body Weight Hamstring Curl"), 
				new Label("Chin Up"), new Label("Deadlift"), new Label("Diamond Push Up"), new Label("Dips"),
				new Label("Dumbell Over Head Press"), new Label("Goblet Squat"), new Label("Hack Squat"),
				new Label("Hamstring Curl"), new Label("Hand Stand Push Up"), new Label("Hip Snatch"), new Label("Dubbell row"),
				new Label("Dumbbell Incline Press"), new Label("Clean"), new Label("Front Squat"), new Label("Pistol Squat"), 
				new Label("Power Jerk"), new Label("Leg Raises"), new Label("Preacher Curls"), new Label("Pull Down"),
				new Label("Pull Up"), new Label("Push Up"), new Label("Bench Press"), new Label("Single Arm Pull Down"),
				new Label("Side Lateral Raise"), new Label("Sit Up"), new Label("Skull Crushers"), new Label("Snatch"),
				new Label("Tricep Pulldown")};
		
		ImageView[] imageView = {new ImageView("AussiePullup.jpg"), new ImageView("Back extension.jpg"), 
				new ImageView("BackSquat.jpg"), new ImageView("Barbell Curl.jpg"), new ImageView("BarbellRow.jpg"),
				new ImageView("BodyWeightHCurl.jpg"), new ImageView("Chinup.jpg"), new ImageView("Deadlift.jpg"),
				new ImageView("DiamondPushup.jpg"), new ImageView("Dips.jpg"), new ImageView("Dumbbell OHP.jpg"),
				new ImageView("GoblietSquat.jpg"), new ImageView("Hack Squat.jpg"), new ImageView("Hamstring curl.jpg"),
				new ImageView("HandstandPU.jpg"), new ImageView("hipSnatch.jpg"), new ImageView("images.jpg"),
				new ImageView("images-1.jpg"), new ImageView("images-2.jpg"), new ImageView("images-3.jpg"),
				new ImageView("images-4.jpg"), new ImageView("jerk.jpg"), new ImageView("LegRaises.jpg"),
				new ImageView("Preacher Curl.jpg"), new ImageView("Pulldown-1.jpg"), new ImageView("PullUp.jpg"),
				new ImageView("Pushup.jpg"), new ImageView("Rec-Bench-Press.jpg"), new ImageView("SApulldown.jpg"),
				new ImageView("SideLateralRaise.jpg"), new ImageView("Situp.jpg"), new ImageView("SkullCrushers.jpg"),
				new ImageView("snatch.jpg"), new ImageView("TricepPulldown.jpg")}; 
		
		GridPane gp = new GridPane(); 
		for(int i = 0; i < imageView.length; i++) {
			imageView[i].setFitWidth(300);
			imageView[i].setFitHeight(200);
			gp.add(imageView[i], 0, i);
			label[i].setFont(Font.font("Times New roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
			label[i].setTextFill(Color.WHITE);
			gp.add(label[i], 1, i);
		}
		gp.setLayoutY(550);
		gp.setLayoutX(25);
		gp.setStyle("-fx-background-color: BLUE"); 
		gp.setVgap(10);
		gp.setHgap(10);
		
		ScrollBar sb = new ScrollBar(); 
		sb.setOrientation(Orientation.VERTICAL);
		sb.setLayoutX(700);
		sb.setLayoutY(20);
		sb.setPrefSize(20, 600);
		sb.valueProperty().addListener(ov -> gp.setLayoutY((sb.getValue() * - gp.getHeight() / sb.getMax()) + 550));
		sb.valueProperty().addListener(ov -> back.setLayoutY((sb.getValue() * - gp.getHeight() / sb.getMax()) + 20));
		sb.valueProperty().addListener(ov -> howTo1.setLayoutY((sb.getValue() * - gp.getHeight() / sb.getMax()) + 100));
		sb.valueProperty().addListener(ov -> howToUse.setLayoutY((sb.getValue() * - gp.getHeight() / sb.getMax()) + 150));
		sb.valueProperty().addListener(ov -> howTo2.setLayoutY((sb.getValue() * - gp.getHeight() / sb.getMax()) + 200));
		sb.valueProperty().addListener(ov -> howToUse1.setLayoutY((sb.getValue() * - gp.getHeight() / sb.getMax()) + 250));
		sb.valueProperty().addListener(ov -> howTo3.setLayoutY((sb.getValue() * - gp.getHeight() / sb.getMax()) + 300));
		sb.valueProperty().addListener(ov -> howToUse2.setLayoutY((sb.getValue() * - gp.getHeight() / sb.getMax()) + 350));
				
		this.setStyle("-fx-background-color: BLUE");
		this.getChildren().addAll(back, sb, howTo1, howToUse, howTo2, howToUse1, howTo3, howToUse2, gp); 
	}
}