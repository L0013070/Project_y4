package project_year4.maze;

public interface NodeListener {
	
	public void changedNode(Node node);
        
        public void updateValue(String value);

    public void updateDirection(NodeDirection direction);

    public void updateWall(boolean wall);

}
