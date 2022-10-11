package capstone;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.stage.Stage;

public class Run extends Application{
	@Override
	public void start(Stage arg0) throws Exception {

		Pane1 pane1 = new Pane1(); 
		Pane2 pane2 = new Pane2(); 
		
		Scene scene = new Scene(pane2, 720, 720);
		arg0.setTitle("pane1");
		arg0.setScene(scene);
		arg0.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args); 

	}
}
