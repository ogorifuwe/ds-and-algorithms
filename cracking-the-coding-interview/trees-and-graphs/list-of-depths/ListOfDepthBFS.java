import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class ListOfDepthBFS {

    private static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
        /* "visit" the root */
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();

        if (root != null) {
            current.add(root);
        }

        while (current.size() > 0) {
            result.add(current);    // add previous level
            LinkedList<TreeNode> parents = current; // go to next level
            current = new LinkedList<TreeNode>();
            for (TreeNode parent : parents) {
                /* visit the children */
                if (parent.left != null) {
                    current.add(parent.left);
                }
                if (parent.right != null) {
                    current.add(parent.right);
                }
            }
        }
        return result;
    }

    public static void printResult(ArrayList<LinkedList<TreeNode>> result) {
        int depth = 0;
        for (LinkedList<TreeNode> entry : result) {
            Iterator<TreeNode> i = entry.listIterator();
            System.out.print("List at depth " + depth +":");
            while(i.hasNext()) {
                System.out.print(" " + ((TreeNode)i.next()).data);
            }
            System.out.print("\n");
            depth++;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = CreateTreeFromArray.createTreeFromArray(nodes);
        ArrayList<LinkedList<TreeNode>> list = createLevelLinkedList(root);
        printResult(list);
    }
}
