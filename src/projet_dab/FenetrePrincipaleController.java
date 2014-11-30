package projet_dab;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class FenetrePrincipaleController {
	
	@FXML
	private Button ConsulterCompte = new Button();
	@FXML
	private Button RetraitArgent = new Button();
	@FXML
	private Button DepotArgent = new Button();
	@FXML
	private Button Quitter = new Button();
	
	private FenetreDistributeurController controller;
	private Main MainApp;
	 
	public FenetrePrincipaleController(){
	}
	
	public void ActionConsulterCompte(){
		this.ConsulterCompte.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	//MainApp.SetFenetrePrincipaleLayout();
		    }
		});
	}
	
	public void ActionRetraitArgent(){
		this.RetraitArgent.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	//MainApp.SetFenetrePrincipaleLayout();
		    }
		});
	}
	
	public void ActionDepotArgent(){
		this.DepotArgent.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	//MainApp.SetFenetrePrincipaleLayout();
		    }
		});
	}
	
	public void ActionQuitter(){
		this.Quitter.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	MainApp.SetDistributeurLayout(true);
		    }
		});
	}
	 
	 public void SetMainApp(Main mainApp){
		 this.MainApp = mainApp;
	 }

}
