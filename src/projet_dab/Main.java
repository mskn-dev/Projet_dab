package projet_dab;
	
import java.net.Socket;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private Stage primaryStage;
	private BorderPane accueilLayout;
	private BorderPane exitLayout;
	private BorderPane DistributeurLayout;
	private BorderPane FentrePrincipaleLayout;
	private ClientDabSocket dabSocket = new ClientDabSocket(); 

	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Acceuil");
			
			SetAcceuilLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public void SetAcceuilLayout(){
		try {	
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Acceuil.fxml"));
			accueilLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(accueilLayout);
			primaryStage.setScene(scene);
			primaryStage.show();

			AcceuilController controller = loader.getController();
			controller.SetMainApp(this);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void SetDistributeurLayout(boolean exit){

		try {	
			this.primaryStage.setTitle("Fenetre Distributeur");
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Dab_fenetreDistributeur.fxml"));
			DistributeurLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(DistributeurLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			FenetreDistributeurController controller = loader.getController();
			if(exit)
				controller.HideInsererButton();
			else
				controller.HideRetirerButton();
			controller.SetMainApp(this);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void SetFenetrePrincipaleLayout(){
		
		try {	
			this.primaryStage.setTitle("Fenetre Principale");
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Dab_fenetrePrincipale.fxml"));
			FentrePrincipaleLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(FentrePrincipaleLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			FenetrePrincipaleController controller = loader.getController();
			controller.HideLabel();
			controller.HideListeAmis();
			controller.HideButton();
			controller.setAmisOnCombo(this.dabSocket);
			controller.SetMainApp(this);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void SetExitLayout(){
		try {	
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Dab_fenetreExit.fxml"));
			exitLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(exitLayout);
			primaryStage.setScene(scene);
			primaryStage.show();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Exit(){
		this.primaryStage.close();
	}
		
	
	public static void main(String[] args) {
		launch(args);	
	}
}
