/**.
 * File: Graph.java
 * ----------------
 */
package routebetweennodes;

public class Graph {

    public static int MAX_VERTICES = 6;
    private Node[] vertices;
    private int count;

    /**. @post constructs a new graph */
    public Graph() {
        vertices = new Node[MAX_VERTICES];
        count = 0;
    }

    /**. 
     * @pre Graph is not full
     * @post adds vertex to graph
     * @param v the vertex to be added to graph
     */
    public void addVertices(Node v) {
        if (count < vertices.length) {
            vertices[count] = v;
            count++;
        } else {
            System.out.print("Graph is full\n");
        }
    }

    /**. @return returns the vertices of this graph */
    public Node[] getVertices() { return vertices; }
}
