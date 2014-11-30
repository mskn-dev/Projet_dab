package projet_dab;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;


public class ExitController {
	
	@FXML
	 private Button ExitButton = new Button();
	 private Main MainApp;
	 
	 public ExitController(){
		 
	 }
	
	 public void ActionExitController(){
		 this.ExitButton.setOnMouseClicked(new EventHandler<MouseEvent>(){
			    public void handle(MouseEvent me){
			    	MainApp.Exit();
			    }
			});
	 }
	 
	 
	 public void SetMainApp(Main mainApp){
		 this.MainApp = mainApp;
	 }

}
