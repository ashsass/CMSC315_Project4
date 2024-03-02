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
			graphView.setBottom(getBottomBorder());
			
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
	
	//Should I do two hboxes for the bottom layer? there is just one text field under four buttons that takes up the full width or can I manage it with one hbox
	public HBox getBottomBorder() {
		/* create hbox */
		HBox hBox = new HBox(15);
		hBox.setAlignment(Pos.CENTER);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		
		/* create buttons */
		Button btnConnected = new Button("Is Connected?");
		Button btnCycles = new Button("Has Cycles?");
		Button btnDfs = new Button("Depth First Search");
		Button btnBfs = new Button("Breadth First Search");
		
		/* create large text field to display message */
		TextField tfMessage = new TextField();
		tfMessage.setEditable(false);
		
		/* add buttons and tf to pane */
		hBox.getChildren().addAll(btnConnected, btnCycles, btnDfs, btnBfs, tfMessage);
		
		return hBox;
	}
}
