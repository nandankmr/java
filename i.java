import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class MyFX extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 250);
		primaryStage.setTitle("My First GUI");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

//GUI program

