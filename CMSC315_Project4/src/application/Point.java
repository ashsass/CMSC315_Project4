/* Name: Ashlyn Sassaman
 * CMSC315 Project 4
 * Due Date: 3/5/24
 * Decription: Holds the x coordinate, the y coordinate, and the name for the point on the graph. 
 */

package application;

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
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public String getName() {
		return name;
	}
}
