package projet_dab;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class FenetreDistributeurController {
		
	@FXML
	private Button InsererCarteButton = new Button();
	@FXML
	private Button RetirerCarteButton = new Button();
	private Main MainApp;
	 
	 public FenetreDistributeurController(){
	 }
	
	 public void ActionInsererCarteButton(){
		 this.InsererCarteButton.setOnMouseClicked(new EventHandler<MouseEvent>(){
			    public void handle(MouseEvent me){
			    	MainApp.SetFenetrePrincipaleLayout();
			    }
			});
	 }
	 
	 public void ActionRetirerCarteButton(){
		 this.RetirerCarteButton.setOnMouseClicked(new EventHandler<MouseEvent>(){
			    public void handle(MouseEvent me){
			    	RetirerCarteButton.setVisible(true);
			    	MainApp.SetExitLayout();
			    }
			});
	 }
	 
	 public void SetMainApp(Main mainApp){
		 this.MainApp = mainApp;
	 }
	 
	 public void HideInsererButton(){
		 this.InsererCarteButton.setVisible(false);
	 }
	 
	 public void HideRetirerButton(){
		 this.RetirerCarteButton.setVisible(false);
	 }

}
