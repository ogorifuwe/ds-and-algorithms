/**.
 * File: RouteBetweenNodes.java
 * ----------------------------
 */
import routebetweennodes.*;
import java.util.LinkedList;

public class RouteBetweenNodes {

    public static void main(String[] args) {
        Graph g = createNewGraph();
        Node[] v = g.getVertices();
        Node start = v[3];
        Node end = v[5];
        System.out.print(search(g, start, end)+"\n");
    }

    public static boolean search(Graph g, Node start, Node end) {
        if (start == end) return true; 
        /* initialize a queue with a linked list of nodes */
        LinkedList<Node> q = new LinkedList<Node>();
        /* initialize the state of the nodes(vertices) to Unvisited */
        for (Node u : g.getVertices()) {
            u.state = State.Unvisited;
        }
        /* change state of start node to visiting and then enqueue */
        start.state = State.Visiting;
        q.add(start);
        Node u;
        while (!q.isEmpty()) {
            u = q.removeFirst();    // dequeue list
            if (u != null) {
                /* get nodes adjacent to u */
                for (Node v : u.getAdjacent()) {
                    if (v.state == State.Unvisited) {
                        if (v == end) {
                            return true;
                        } else {
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = State.Unvisited;
            }
        }
        return false;
    }

    public static Graph createNewGraph() {
        Graph g = new Graph();
        Node[] vrtx = new Node[6];
        vrtx[0] = new Node("a", 3);
        vrtx[1] = new Node("b", 0);
        vrtx[2] = new Node("c", 0);
        vrtx[3] = new Node("d", 1);
        vrtx[4] = new Node("e", 1);
        vrtx[5] = new Node("f", 0);
        /* add adjacent nodes/vertices to vertex */
        vrtx[0].addAdjacent(vrtx[1]);
        vrtx[0].addAdjacent(vrtx[2]);
        vrtx[0].addAdjacent(vrtx[3]);
        vrtx[3].addAdjacent(vrtx[4]);
        vrtx[4].addAdjacent(vrtx[5]);
        /* add vertices to graph*/
        for (int i=0; i<6; ++i)
            g.addVertices(vrtx[i]);
        
        return g;
    }
}
