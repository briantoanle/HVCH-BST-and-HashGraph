
public class GraphEdge {
	private GraphNode fEndpoint;
	private GraphNode sEndpoint;
	private int edgeType;
	private String edgeLabel;
	
	public GraphEdge(GraphNode u, GraphNode v, int type, String label) {
		this.fEndpoint = u;
		this.sEndpoint = v;
		this.edgeType = type;
		this.edgeLabel = label;
	}
	
	public GraphNode firstEndpoint() {
		return this.fEndpoint;
	}
	public GraphNode secondEndpoint() {
		return this.sEndpoint;
	}
	
	public int getType() {
		return this.edgeType;
	}
	
	public void setType(int newType) {
		this.edgeType = newType;
	}
	
	public String getLabel() {
		return this.edgeLabel;
	}
	
	public void setLabel(String newLabel) {
		this.edgeLabel = newLabel;
	}
}
