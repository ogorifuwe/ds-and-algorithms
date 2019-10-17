/**.
 * File: GraphTraversal.java
 * -------------------------
 */
public class GraphTraversal {

    /**. Depth First Search */
    void search() {
        if (root == null) return;
        visit(root);
        root.visited = true;
        for each (Node n in root.adjacent) {
            if (n.visited == false) {
                search(n);
            }
        }
    }
    
    /**. BreadthFirstSearch */
    void search() {
        Queue queue = new Queue();
        root.marked = true;
        queue.enqueue(root);    // add to the end of the queue

        while (!queue.isEmpty()) {
            Node r = queue.dequeue();   // remove from the front of the queue
            visit(r);
            for each (Nide n in r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.dequeue(n);
                }
            } 
        }
    }
}
