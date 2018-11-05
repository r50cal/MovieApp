package test1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	   public static void main(String[] args) {
	          launch(args);
	   }
		 
public void start(Stage primaryStage) throws Exception {
		String fxmlResource = "Sample.fxml";
	      Parent panel;
	      panel = FXMLLoader.load(getClass().getResource(fxmlResource));
	      Scene scene = new Scene(panel);
	      Stage stage = new Stage();
	      stage.setScene(scene);
	      stage.show();
	      //test//
		}
	}
