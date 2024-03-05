/* Name: Ashlyn Sassaman
 * CMSC315 Project 4
 * Due Date: 3/5/24
 * Decription:
 */

package application;

import java.util.*;

/*
 - [ ] The second class should be a class that defines the graph. You may use any graph representation that allows an unlimited number of vertices and edges. It should have the following public methods 
	- [x] A method to add a vertex 
	- [x] A method to add an edge 
	- [ ] A method that checks whether the graph has cycles 
	- [ ] A method to check whether the graph is connected 
	- [ ] A method that returns a list of vertices resulting from a depth-first graph search 
	- [ ] A method that returns a list of vertices resulting from a breadth-first graph search 
	- [ ] You may add any other methods as needed. 
 */


public class UndirectedGraph {
	private int nameIndex = 0; //needed to put this here to create a baseline value for the name - once it is called once the first name should be A
	private int vertexListIndex = 0; //need to be able to put the point in the correct place in the vertex list - this is getting complicated now that it is a list holding an arraylist 

	/* the index indicates the name of the point */
	private List<ArrayList<Point>> vertexList = new ArrayList<>();
	
	/* no-constructor */
	public UndirectedGraph() {
		
	}
	
	public Point addVertex(double x, double y) {
		String name = createName();
		Point point = new Point(x, y, name);
		vertexList.add(new ArrayList<>());
		vertexList.get(vertexListIndex).add(point);
		vertexListIndex++;
		return point;
	}
	
	public String createName() {
		//uses index from global data field to create names through alphabet and uses modulo to control the values to only go from A to Z
		char name = (char)('A' + nameIndex % 26);
		//Also want to control the suffix so that we can have an infinite amount of labels
		int suffix = nameIndex / 26;
		nameIndex++;
		
		if(suffix == 0) 
			return String.valueOf(name);
		else
			return String.valueOf(name) + suffix;
	}
	
	public Point getPoint(int i) {
		//Going into a List that holds ArrayLists so going to the index will go to the corresponding point name ('A' is 0) and then the ArrayList at index 0 should hold the original point
//		System.out.printf("Point is at index %d, its x is %f, its y is %f, it's name is %s\n", i, vertexList.get(i).get(0).getX(), vertexList.get(i).get(0).getY(), vertexList.get(i).get(0).getName());
		return vertexList.get(i).get(0);
	}
	
	public void addEdge(int i1, Point p1, int i2, Point p2) {
		//Add edge to first point's index
		vertexList.get(i1).add(p2);
		//Add edge to second point's index
		vertexList.get(i2).add(p1);
		
	}
}
