/* Name: Ashlyn Sassaman
 * CMSC315 Project 4
 * Due Date: 3/5/24
 * Decription:
 */

package application;

import java.util.*;

public class UndirectedGraph {
	private int nameIndex = 0; //first name should be A
	private static int vertexListIndex = 0; //need to be able to put the point in the correct place in the vertex list 
	
	public static void main(String[] args) {
		vertexList.add(new ArrayList<>());
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "A"));
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "F"));
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "E"));
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "B"));
		vertexListIndex++;
		vertexList.add(new ArrayList<>());
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "B"));
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "A"));
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "D"));
		vertexListIndex++;
		vertexList.add(new ArrayList<>());
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "C"));
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "D"));
		vertexListIndex++;
		vertexList.add(new ArrayList<>());
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "D"));
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "B"));
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "C"));
		vertexListIndex++;
		vertexList.add(new ArrayList<>());
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "E"));
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "A"));
		vertexListIndex++;
		vertexList.add(new ArrayList<>());
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "F"));
		vertexList.get(vertexListIndex).add(new Point(0.0, 0.0, "A"));
		System.out.println(bfs().toString());
	}

	/* the index indicates the name of the point */
	private static List<ArrayList<Point>> vertexList = new ArrayList<>();
	
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
		return vertexList.get(i).get(0);
	}
	
	public void addEdge(int i1, Point p1, int i2, Point p2) {
		vertexList.get(i1).add(p2);
		vertexList.get(i2).add(p1);
		
	}
	
	
	public List<String> dfs() {
		int start = 0; //Start at A
	    List<String> searchOrder = new ArrayList<>();
	    //Initialize all parents to -1
//	    int[] parent = new int[vertexList.size()];
//	    for (int i = 0; i < parent.length; i++)
//	    		parent[i] = -1; 
	    //Keep track of visited indices
	    boolean[] isVisited = new boolean[vertexList.size()];

	    // Recursively search
//	    dfs(start, parent, searchOrder, isVisited);
	    dfs(start, searchOrder, isVisited);

	    return searchOrder;
	  }

//	  private void dfs(int i, int[] parent, List<String> searchOrder,
//	      boolean[] isVisited) {
	private void dfs(int i, List<String> searchOrder,
		      boolean[] isVisited) {
		  searchOrder.add(vertexList.get(i).get(0).getName());
		  isVisited[i] = true; 
		  
		  for (Point e : vertexList.get(i)) { 
			  int next = (int)e.getName().charAt(0) - 'A';
			  if (!isVisited[next]) { 
//				  parent[next] = i; 
//				  dfs(next, parent, searchOrder, isVisited); 
				  dfs(next, searchOrder, isVisited); 
		      }
		  }
	  }
	  
	  public static List<String> bfs() {
		  //Start at A
		  int start = 0; 
		  
		  //Create lists
		  List<String> searchOrder = new ArrayList<>();
		  LinkedList<Integer> queue = new LinkedList<>();
		  
		  //Initialize all parents to -1
		  //Don't think I need parent in this situation actually 
//		  int[] parent = new int[vertexList.size()];
//		  for(int i = 0; i < vertexList.size(); i++) {
//			  parent[i] = -1;
//		  } 
		  
		  //Keep track of visited indices
		  boolean[] isVisited = new boolean[vertexList.size()];
		  
		  //Begin search
		  queue.offer(start);
		  isVisited[start] = true;
		  
		  while(!queue.isEmpty()) {
			  int i = queue.poll();
			  searchOrder.add(vertexList.get(i).get(0).getName());
			  for (Point e: vertexList.get(i)){
				  int next = (int)e.getName().charAt(0) - 'A';
				  if(!isVisited[next]) {
					  queue.offer(next);
					  isVisited[next] = true;
				  }
			  }
		  }
		  
		  return searchOrder;
	  }
}
