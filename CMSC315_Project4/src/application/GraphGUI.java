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
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;


public class GraphGUI extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GraphView graphView = new GraphView();
			
			//add the top and bottom border to the pane
			//graphview.getChildren().add(getTopBorder());
			graphView.setTop(getTopBorder());
			
			Scene scene = new Scene(graphView, 500, 500);
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
		/* creating hbox */
		HBox hBox = new HBox(15);
		hBox.setAlignment(Pos.CENTER);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		
		/* add in buttons and text fields */
		hBox.getChildren().add(new Button("Add Edge"));
		
		//Vertex 1
		//hBox.getChildren().add(new Label("Vertex 1"));
		TextField tfVertexOne = new TextField(); //need to create a variable so we can target it later
		tfVertexOne.setPrefWidth(30);
		
		//Vertex 2
		//hBox.getChildren().add(new Label("Vertex 2"));
		TextField tfVertexTwo = new TextField(); //need to create a variable so we can target it later
		tfVertexTwo.setPrefWidth(30);
		
		//Add fields to HBox
		hBox.getChildren().addAll(new Label("Vertex 1"), tfVertexOne, 
				new Label("Vertex 2"), tfVertexTwo);
		
		return hBox;
	}
}
