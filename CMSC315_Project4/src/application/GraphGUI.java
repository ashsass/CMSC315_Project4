/* Name: Ashlyn Sassaman
 * CMSC315 Project 4
 * Due Date: 3/5/24
 * Decription: 
 */

package application;

/*
- [ ] The fourth class should contain 
	- [x] the main method
	- [x] should create the GUI including all the buttons and text fields. 
	- [ ] It should include event handlers for each of the buttons. 
 */
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;


public class GraphGUI extends Application {
	//needed to put this here to access graphview in the event listeners - should event listeners be in a better place? i feel like they shouldn't share the function. but i need to access the variables and I don't want to put them more variables as global variables - does it matter? it feels like it does

	GraphView graphView;
	UndirectedGraph graph;
	TextField tfMessage = new TextField();
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//add the top and bottom border to the pane
			graph = new UndirectedGraph();
			graphView = new GraphView(graph);
			graphView.setTop(getTopBorder());
			graphView.setBottom(getBottomBorder());
			
			//event listeners for the buttons
			
			
			Scene scene = new Scene(graphView, 550, 600);
			primaryStage.setTitle("Project 4: Graph GUI");
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IndexOutOfBoundsException ex) {
			System.out.print(ex);
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
		
		Button btnEdge = new Button("Add Edge");
		
		//Vertex 1
		TextField tfVertexOne = new TextField(); 
		tfVertexOne.setPrefWidth(30);
		
		//Vertex 2 
		TextField tfVertexTwo = new TextField();
		tfVertexTwo.setPrefWidth(30);
		
		//Add fields to HBox
		hBox.getChildren().addAll(btnEdge, new Label("Vertex 1"), tfVertexOne, 
				new Label("Vertex 2"), tfVertexTwo);
		
		//How to put an error message on the textfield?
		btnEdge.setOnAction(event ->	graphView.drawEdge(tfVertexOne.getText(), tfVertexTwo.getText()));
	
		return hBox;
	}
	
	//Should I do two hboxes for the bottom layer? there is just one text field under four buttons that takes up the full width or can I manage it with one hbox
	public VBox getBottomBorder() {
		//instead create a vbox that holds buttons on one level and the text field on the next level and set that to bottom border
		/* create hbox to hold buttons*/
		HBox hBox = new HBox(15);
		hBox.setAlignment(Pos.CENTER);
		hBox.setPadding(new Insets(0, 0, 10, 0));
		
		/* create buttons */
		Button btnConnected = new Button("Is Connected?");
		Button btnCycles = new Button("Has Cycles?");
		Button btnDfs = new Button("Depth First Search");
		Button btnBfs = new Button("Breadth First Search");
		
		//Event handler
		//btnDfs.setOnAction(e -> graph.dfs());
		
		/* create large text field to display message */
		tfMessage.setEditable(false);
		
		/* add buttons to hbox */
		hBox.getChildren().addAll(btnConnected, btnCycles, btnDfs, btnBfs);
		
		/* add hbox and tfmessage to vbox */
		VBox vBox = new VBox(hBox, tfMessage); 
		vBox.setPadding(new Insets(15, 30, 30, 30));
		
		return vBox;
	}
}
