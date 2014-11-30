package projet_dab;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
	@FXML
	private Button RetraitCinq = new Button();
	@FXML
	private Button RetraitDix = new Button();
	@FXML
	private Button RetraitVingt = new Button();
	@FXML
	private Button RetraitTrente = new Button();

	
	@FXML
	private Label Resultat = new Label();
	

	private Main MainApp;
	private Distributeur Dab = new Distributeur();
	
	 
	public FenetrePrincipaleController(){
	}
	
	public void ActionConsulterCompte(){
		this.ConsulterCompte.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	HideButtonRetrait();
		    	ShowLabel();
		    	Resultat.setText("Votre Solde est de : "+Dab.GetSolde()+"€");
		    }
		});
	}
	
	public void ActionRetraitArgent(){
		this.RetraitArgent.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	Resultat.setText("Combien voulez-vous retirer ?");
		    	ShowButtonRetrait();
		    	ShowLabel();
		    }
		});
	}
	
	public void ActionRetraitSomme(){
		this.RetraitCinq.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	ActionRetraitSomme(5);
		    }
		});
		this.RetraitDix.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	ActionRetraitSomme(10);
		    }
		});
		this.RetraitVingt.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	ActionRetraitSomme(20);
		    }
		});
		this.RetraitTrente.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	ActionRetraitSomme(30);
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
	 
	 public void HideLabel(){
		 this.Resultat.setVisible(false);
	 }
	 
	 public void ShowLabel(){
		 this.Resultat.setVisible(true);
	 }
	 
	 public void HideButtonRetrait(){
		 this.RetraitCinq.setVisible(false);
		 this.RetraitDix.setVisible(false);
		 this.RetraitVingt.setVisible(false);
		 this.RetraitTrente.setVisible(false);
	 }
	 
	 public void ShowButtonRetrait(){
		 this.RetraitCinq.setVisible(true);
		 this.RetraitDix.setVisible(true);
		 this.RetraitVingt.setVisible(true);
		 this.RetraitTrente.setVisible(true);
	 }
	 
	 public void ActionRetraitSomme(int somme){
		if(Dab.Retrait(somme)){
	    	HideButtonRetrait();
	    	ShowLabel();
	    	Resultat.setText("Votre nouveau solde est de : "+Dab.GetSolde()+"€");
		}
		else{
			HideButtonRetrait();
	    	ShowLabel();
			Resultat.setText("Votre solde est inférieur à la somme que vous voulez retirer ! ");
		}
			
	 }
	 
}
