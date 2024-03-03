/* Name: Ashlyn Sassaman
 * CMSC315 Project 4
 * Due Date: 3/5/24
 * Decription:
 */

package application;
import javafx.scene.layout.*;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.shape.*;

/*
  The third class is should be an extension of the javafx Pane class that visually displays the graph. It should contain 
	- [ ] an event handler that responds to mouse clicks that creates new vertices
	- [ ] a method that is called to draw edges. 
 */

/*
T HOUGHTS
- probably need to create a limit of where the user can place points - don't want it going to where the buttons are in the border
- potienal problem with trying to get the text field information will probably need to change where the variable gets created? definitely something that will come up later 
- Maybe using grid pane would be better than border pane?? would it matter when it comes to placing actual vertices? 
- Don't want the screen to be resizable
 */


//Working on adding an event listener to create new vertices and in undirected graph using the method there to actually create the points - where exactly should the event listener go?
//get a point returned from the graph to create a circle and display it on the pane
//also need to figure out how to set this on the border pane - just setcenter? 
public class GraphView extends BorderPane{
	
	/* no-arg constructor */
	public GraphView() {
		UndirectedGraph graph = new UndirectedGraph();
		
		/* get coordinates for point */
		setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if(event.getButton() == MouseButton.PRIMARY) {
					double x = event.getSceneX();
					double y = event.getSceneY();
					//create a new point and turn it into a circle
					//this seems like i'm going about this in an inefficient way???
					Point newPoint = graph.addVertex(x, y);
					getChildren().add(new Circle(newPoint.getX(), newPoint.getY(), 5.0));
				}
			}
		});
	}
	
	 

}
