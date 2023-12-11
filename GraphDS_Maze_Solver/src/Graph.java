import java.util.ArrayList;
import java.util.Iterator;

public class Graph implements GraphADT{
	
	ArrayList<GraphNode>[] graph = new ArrayList[10];
	
	public Graph(int n) {
		for(int i = 0; i < n; i++) {
			graph.add(i,ArrayList<GraphNode>());
					
		}
		
	}

	public void insertEdge(GraphNode u, GraphNode v, int edgeType, String label) throws GraphException{
		GraphEdge temp = new GraphEdge(u,v,edgeType,label);
	}
	
	public GraphNode getNode(int name) throws GraphException{
		return null;
	}
	
	public Iterator<GraphEdge> incidentEdges(GraphNode u) throws GraphException{
		return null;
	}
	
	public GraphEdge getEdge(GraphNode u, GraphNode v) throws GraphException{
		return null;
	}
	
	public boolean areAdjacent(GraphNode u, GraphNode v) throws GraphException{
		// return true if u and v are adjacent, false otherwise
		// throw exception if u or v are not node of graph
		return false;
	}
	
	public static void main(String[] args) {
		Graph gr = new Graph(4);
		
	}
	
}
