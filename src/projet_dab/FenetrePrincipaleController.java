package projet_dab;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class FenetrePrincipaleController {
	
	private boolean IsRetrait = false; 
	
	@FXML
	private Button ConsulterCompte = new Button();
	@FXML
	private Button RetraitArgent = new Button();
	@FXML
	private Button DepotArgent = new Button();
	@FXML
	private Button Quitter = new Button();
	@FXML
	private Button CinqButton = new Button();
	@FXML
	private Button DixButton = new Button();
	@FXML
	private Button VingtButton = new Button();
	@FXML
	private Button TrenteButton = new Button();

	
	@FXML
	private Label Resultat = new Label();
	

	private Main MainApp;
	private Distributeur Dab = new Distributeur();
	
	 
	public FenetrePrincipaleController(){
	}
	
	public void ActionConsulterCompte(){
		this.ConsulterCompte.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	HideButton();
		    	ShowLabel();
		    	Resultat.setText("Votre Solde est de : "+Dab.GetSolde()+"€");
		    }
		});
	}
	
	public void ActionRetraitArgent(){
		this.RetraitArgent.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	Resultat.setText("Combien voulez-vous retirer ?");
		    	ShowButton();
		    	ShowLabel();
		    	IsRetrait = true;
		    }
		});
	}
	
	public void ActionDepotArgent(){
		this.DepotArgent.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	Resultat.setText("Combien voulez-vous déposer ?");
		    	ShowButton();
		    	ShowLabel();
		    	IsRetrait = false;
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
	 
	
	public void ActionSomme(){
		this.CinqButton.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	if(IsRetrait)
		    		ActionRetraitSomme(5);
		    	else
		    		ActionDepotSomme(5);
		    }
		});
		this.DixButton.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	if(IsRetrait)
		    		ActionRetraitSomme(10);
		    	else
		    		ActionDepotSomme(10);
		    }
		});
		this.VingtButton.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	if(IsRetrait)
		    		ActionRetraitSomme(20);
		    	else
		    		ActionDepotSomme(20);
		    }
		});
		this.TrenteButton.setOnMouseClicked(new EventHandler<MouseEvent>(){
		    public void handle(MouseEvent me){
		    	if(IsRetrait)
		    		ActionRetraitSomme(30);
		    	else
		    		ActionDepotSomme(30);
		    }
		});
	}
	
	 public void ActionRetraitSomme(int somme){
			if(Dab.Retrait(somme)){
		    	HideButton();
		    	ShowLabel();
		    	Resultat.setText("Votre nouveau solde est de : "+Dab.GetSolde()+"€");
			}
			else{
				HideButton();
		    	ShowLabel();
				Resultat.setText("Votre solde est inférieur à la somme que vous voulez retirer ! ");
			}
				
		 }
	 
	 public void ActionDepotSomme(int somme){
			if(Dab.Depot(somme)){
		    	HideButton();
		    	ShowLabel();
		    	Resultat.setText("Votre nouveau solde est de : "+Dab.GetSolde()+"€");
			}
			else{
				HideButton();
		    	ShowLabel();
				Resultat.setText("La somme dans votre compte ne peut pas excéder 200 € ! ");
			}
				
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
	 
	 public void HideButton(){
		 this.CinqButton.setVisible(false);
		 this.DixButton.setVisible(false);
		 this.VingtButton.setVisible(false);
		 this.TrenteButton.setVisible(false);
	 }
	 
	 public void ShowButton(){
		 this.CinqButton.setVisible(true);
		 this.DixButton.setVisible(true);
		 this.VingtButton.setVisible(true);
		 this.TrenteButton.setVisible(true);
	 }
	 
}
