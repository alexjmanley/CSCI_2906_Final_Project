package capstone;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.stage.Stage;

public class Run extends Application{
	Pane1 pane1 = new Pane1(); 
	Pane2 pane2 = new Pane2(); 
	Pane3 pane3 = new Pane3(); 
	ExercisePane exercisePane = new ExercisePane(); 
	NutritionPane nutritionPane = new NutritionPane(); 
	RestPane restPane = new RestPane();  
	VideoPane videoPane = new VideoPane(); 
	private Stage stage; 
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		Scene scene1 = new Scene(pane1, 720, 720); 
		Scene scene2 = new Scene(pane2, 720, 720); 
		Scene scene3 = new Scene(pane3, 720, 720); 
		Scene scene4 = new Scene(exercisePane, 720, 720); 
		Scene scene5 = new Scene(nutritionPane, 720, 720); 
		Scene scene6 = new Scene(restPane, 720, 720);
		Scene scene7 = new Scene(videoPane, 720, 720); 
		
		//button set on action for pane 1 
		pane1.newUser.setOnAction(e -> {
			stage.setScene(scene2);
		});
		
		//button seton action for pane
		pane2.next.setOnAction(e -> {
			pane2.populateVariables();
			exercisePane.startDate1 = pane2.startDate; 
			exercisePane.cardio = pane2.vcardio; 
			exercisePane.training = pane2.vtraining;
			exercisePane.weeksToGoal = pane2.weeksToGoal;
			nutritionPane.calories = pane2.vcalories; 
			nutritionPane.startDate1 = pane2.startDate; 
			nutritionPane.weeksToGoal = pane2.weeksToGoal; 
			restPane.startDate1 = pane2.startDate; 
			restPane.weeksToGoal = pane2.weeksToGoal;
			
			exercisePane.buildPane();
			nutritionPane.buildPane();
			restPane.buildPane();
			
			pane2.weeksToGoal = 0;
			
			stage.setScene(scene3);
		});
		
		//Button setonaction for pane3
		pane3.exercise.setOnAction(e -> {
			stage.setScene(scene4);
		});
		pane3.nutrition.setOnAction(e -> {
			stage.setScene(scene5);
		});
		pane3.rest.setOnAction(e -> {
			stage.setScene(scene6);
		});
		pane3.logout.setOnAction(e -> {
			stage.setScene(scene1);
		});
		pane3.ExerciseList.setOnAction(e -> {
			stage.setScene(scene7); 
		});
		
		
		//back buttons for nutrition exercise rest panes
		exercisePane.back.setOnAction(e -> {
			stage.setScene(scene3);
		});
		restPane.back.setOnAction(e -> {
			stage.setScene(scene3);
		});
		nutritionPane.back.setOnAction(e -> {
			stage.setScene(scene3);
		});
		videoPane.back.setOnAction(e -> {
			stage.setScene(scene3);
		});
		
		this.stage = arg0; 
		arg0.setTitle("pane1");
		arg0.setScene(scene1);
		arg0.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args); 

	}
}