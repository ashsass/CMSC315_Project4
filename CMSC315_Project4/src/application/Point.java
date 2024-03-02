/* Name: Ashlyn Sassaman
 * CMSC315 Project 4
 * Due Date: 3/5/24
 * Decription:
 */

package application;
/*
- [ ] The first class should be an immutable class that defines a vertex of the graph
- [ ] contains the _x_ and _y_ coordinates of the vertex
- [ ] contains the name of the vertex.
- [ ] It should have a constructor and three getter methods. 
*/

public class Point {
	private double x;
	private double y;
	private String name;
	
	/* no-arg constructor */
	public Point() {
		
	}
	
	public Point(double x, double y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}
	

}
