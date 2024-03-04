/* Name: Ashlyn Sassaman
 * CMSC315 Project 4
 * Due Date: 3/5/24
 * Decription:
 */

package application;
import javafx.scene.layout.*;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

/*
  The third class is should be an extension of the javafx Pane class that visually displays the graph. It should contain 
	- [x] an event handler that responds to mouse clicks that creates new vertices
		- where is the best place for it in the code? in the constructor?
	- [ ] a method that is called to draw edges. 
 */

/*
THOUGHTS 
- potienal problem with trying to get the text field information will probably need to change where the variable gets created? definitely something that will come up later 
- Maybe using grid pane would be better than border pane?? would it matter when it comes to placing actual vertices? 
- Don't want the screen to be resizable
 */


public class GraphView extends BorderPane {
	//the index indicates the name of the point - this could be useful
	ArrayList<Point> vertexList = new ArrayList<>();
	
	/* no-arg constructor */
	public GraphView() {
		UndirectedGraph graph = new UndirectedGraph();
		/* mouse click event listener for x, y points */
		setOnMouseClicked(event ->  {
				//The center portion's height is 437
				//top border height is 0 - 50 
				//bottom border height is 498 - 600
				if(event.getButton() == MouseButton.PRIMARY) {
					double x = event.getSceneX();
					double y = event.getSceneY();
					//keeping x and y within center border
					if(y > 50 && y < 498) {
						//create a new point and turn it into a circle
						//this seems like i'm going about this in an inefficient way???
						Point newPoint = graph.addVertex(x, y);
						vertexList.add(newPoint);
						getChildren().addAll(new Circle(x, y, 5.0),
								new Text(x - 5, y - 10, newPoint.getName()));
					}
				}
		});
	}
	
	 public void drawEdge(String v1, String v2) {
		 //If in lower case change to upper case 
		 //Validate that the vertices exist
		 //Catch the error if try to draw an edge but not vertices
		 //The way I can catch for vertices not made is out of bound error - come back to this
		 if(v1.length() == 1 && v2.length() == 1) {
			 int index1 = (int)v1.charAt(0) - 'A';
			 int index2 = (int)v2.charAt(0) - 'A';
			 System.out.printf("Point x: %f, y: %f, name: %s", vertexList.get(index1).getX(), vertexList.get(index1).getY(), vertexList.get(index1).getName());
			 System.out.printf("Point x: %f, y: %f, name: %s", vertexList.get(index2).getX(), vertexList.get(index2).getY(), vertexList.get(index2).getName());
		 }
	 }

}
