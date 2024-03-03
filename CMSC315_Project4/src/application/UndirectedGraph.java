/* Name: Ashlyn Sassaman
 * CMSC315 Project 4
 * Due Date: 3/5/24
 * Decription:
 */

package application;

/*
 - [ ] The second class should be a class that defines the graph. You may use any graph representation that allows an unlimited number of vertices and edges. It should have the following public methods 
	- [x] A method to add a vertex 
	- [ ] A method to add an edge 
	- [ ] A method that checks whether the graph has cycles 
	- [ ] A method to check whether the graph is connected 
	- [ ] A method that returns a list of vertices resulting from a depth-first graph search 
	- [ ] A method that returns a list of vertices resulting from a breadth-first graph search 
	- [ ] You may add any other methods as needed. 
 */


public class UndirectedGraph {
	private int index = 0; //needed to put this here to create a baseline value for the name - once it is called once the first name should be A
	
	/* no-constructor */
	public UndirectedGraph() {
		
	}
	
	public Point addVertex(double x, double y) {
		String name = createName();
		
		//create a new point
		return new Point(x, y, name);	
		//Not really doing anything with this at this point just using it to create a circle in graph view will probably need to store it in a list to create the actual graph
	}
	
	public String createName() {
		//uses index from global data field to create names through alphabet and uses modulo to control the values to only go from A to Z
		char name = (char)('A' + index % 26);
		//Also want to control the suffix so that we can have an infinite amount of labels
		int suffix = index / 26;
		index++;
		
		if(suffix == 0) 
			return String.valueOf(name);
		else
			return String.valueOf(name) + suffix;
	}
}
