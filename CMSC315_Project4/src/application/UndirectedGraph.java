/* Name: Ashlyn Sassaman
 * CMSC315 Project 4
 * Due Date: 3/5/24
 * Decription:
 */

package application;

/*
 - [ ] The second class should be a class that defines the graph. You may use any graph representation that allows an unlimited number of vertices and edges. It should have the following public methods 
	- [ ] A method to add a vertex 
	- [ ] A method to add an edge 
	- [ ] A method that checks whether the graph has cycles 
	- [ ] A method to check whether the graph is connected 
	- [ ] A method that returns a list of vertices resulting from a depth-first graph search 
	- [ ] A method that returns a list of vertices resulting from a breadth-first graph search 
	- [ ] You may add any other methods as needed. 
 */

//Want to create the method to add vertices
//Thinking the mouse will click and it will use that point at the x, y coord to create a point and name it whatever 
//And the points could be stored in a list to keep track of them (the adjacency list for the graph) - should i pull from that to make the javafx circles? maybe not because i won't need to remove themn so i dont really need to keep track of them? something to think about it i run into problems 

public class UndirectedGraph {
	
	/* no-constructor */
	public UndirectedGraph() {
		
	}
	
	public Point addVertex(double x, double y) {
		//need to keep track of points that are added
		//pull from the information taken from the mouse click to create a point
		//Maybe return the point so it can be added to a list and used to create a cirlce to add to pane 
		
		return null;
	}
}
