/* Name: Ashlyn Sassaman
 * CMSC315 Project 4
 * Due Date: 3/5/24
 * Decription: 
 */

package application;

/*
- [ ] The fourth class should contain 
	- [ ] the main method
	- [ ] should create the GUI including all the buttons and text fields. 
	- [ ] It should include event handlers for each of the buttons. 
 */
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;


public class GraphGUI extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GraphView graphview = new GraphView();
			Scene scene = new Scene(graphview, 500, 500);
			primaryStage.setTitle("Project 4: Graph GUI");
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(Exception ex) {
			System.out.print(ex);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	public HBox getTopBorder() {
		HBox hbox = new HBox(15);
		hbox.getChildren().add(new Button("Add Edge"));
		return hbox;
	}
}
