import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.FontWeight;
import javafx.geometry.Insets;
import javafx.geometry.Pos;



public class Exercise extends Application{
	
	public void start(Stage primaryStage){
	Button btn = new Button("Does stuffs");

	StackPane root = new StackPane();
	root.getChildren().add(btn);


	GridPane grid = new GridPane();
	grid.setAlignment(Pos.CENTER);
	grid.setHgap(10);
	grid.setVgap(10);
	grid.setPadding(new Insets(25,25,25,25));
	grid.setGridLinesVisible(false);

	

	Text welcm = new Text("WELCOME");
	welcm.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	grid.add(welcm, 0, 0, 2, 1);



	TextField usernameTextField = new TextField();
	grid.add(usernameTextField, 1,1);

	Label usernameLabel = new Label("Username:");
	grid.add(usernameLabel, 0,1);

	TextField department = new TextField();
	grid.add(department, 1,2);

	Label passwordLabel = new Label("Password:");
	grid.add(passwordLabel, 0,3);

	PasswordField pwordField = new PasswordField();
	grid.add(pwordField, 1, 3);

	Label departmentLabel = new Label("Department:");
	grid.add(departmentLabel, 0,2);

	Button signUp = new Button("SignUp");
	signUp.setAlignment(Pos.BOTTOM_RIGHT);
	grid.add(signUp, 4, 8);
	


	Scene scene = new Scene(grid, 300, 250);
	primaryStage.setTitle("Trial");
	primaryStage.setScene(scene);
	primaryStage.show();

	}

	

	public static void main(String[] args) {
		launch(args);

	}
}