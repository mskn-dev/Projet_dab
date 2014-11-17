package projet_dab;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private Stage primaryStage;
	private BorderPane accueilLayout;
	static {
        Font.loadFont(Main.class.getResource("./fonts/fontawesome-webfont.ttf").toExternalForm(), 10);
    }
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Acceuil");
			
			SetAcceuilLayout();
			SetDistributeurLayout();
			
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
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void SetDistributeurLayout(){

		try {	
			//FXMLLoader loader = new FXMLLoader();
			//loader.setLocation(Main.class.getResource("Acceuil.fxml"));
			//accueilLayout = (BorderPane) loader.load();
			
			//Scene scene = new Scene(accueilLayout);
			//primaryStage.setScene(scene);
			//primaryStage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
