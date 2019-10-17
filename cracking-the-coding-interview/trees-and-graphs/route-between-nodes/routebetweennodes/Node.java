/**.
 * File: Node.java
 * ---------------
 */
package routebetweennodes;

public class Node {
    
    private Node[] adjacent;
    private String vertex;
    private int adjacentCount;
    public State state;

    /**.
     * @post constructs a new node with vertex and adjacentCount
     * @param vertex the string idenfifier of this node in the graph 
     * @param adjacentLength the number of adjacent nodes that this can
     *        be connected to
     */
    public Node(String vertex, int adjacentLength) {
        this.vertex = vertex;
        adjacent = new Node[adjacentLength];
        adjacentCount = 0;
    }

    /**.
     * @pre adjacentCount < adjacent length
     * @post adds a node/vertex adjacently to this node
     * @param v is the node/vertex to be added
     */
    public void addAdjacent(Node v) {
        if (adjacentCount < adjacent.length) {
            adjacent[adjacentCount] = v;
            adjacentCount++;
        } else {
            System.out.print("No more adjacent nodes can be added\n");
        }
    }

    /**. @return returns the adjacent nodes/vertices connected to this node */
    public Node[] getAdjacent() { return adjacent; }

    /**. @return returns the vertex of this node */
    public String getVertex() { return vertex; }
}
