/* Name: Ashlyn Sassaman
 * CMSC315 Project 4
 * Due Date: 3/5/24
 * Decription:
 */

package application;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.control.*;

/*
  The third class is should be an extension of the javafx Pane class that visually displays the graph. It should contain 
	- [ ] an event handler that responds to mouse clicks that creates new vertices
	- [ ] a method that is called to draw edges. 
 */

/*
THOUGHTS
- probably need to create a limit of where the user can place points - don't want it going to where the buttons are in the border
 */

public class GraphView extends BorderPane{
	
	/* no-arg constructor */
	public GraphView() {
		
	}
	
	public HBox getTopBorder() {
		HBox hbox = new HBox(15);
		hbox.getChildren().add(new Button("Add Edge"));
		return hbox;
	}

}
