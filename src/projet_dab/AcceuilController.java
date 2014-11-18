package projet_dab;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class AcceuilController {
	 @FXML
	 private Button AcceuilButton = new Button();
	 private Main MainApp;
	 
	 public AcceuilController(){
		 
	 }
	
	 public void ActionAcceuilController(){
		 this.AcceuilButton.setOnMouseClicked(new EventHandler<MouseEvent>(){
			    public void handle(MouseEvent me){
			    	System.out.println("Sosos");
			    }
			});
	 }
	 
	 public void SetMainApp(Main mainApp){
		 this.MainApp = mainApp;
	 }
	 
}
