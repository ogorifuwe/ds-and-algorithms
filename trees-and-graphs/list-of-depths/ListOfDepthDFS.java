/**.
 * File: ListOfDepthDFS.java
 * -------------------------
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class ListOfDepthDFS {
    
    private static void createLevelLinkedList(TreeNode root, 
                                    ArrayList<LinkedList<TreeNode>> lists, int level) {
        if (root == null) return;  // base case

        LinkedList<TreeNode> list = null;
        if (lists.size() == level) {
            list = new LinkedList<TreeNode>();
            /* levels are always traversed in order. So, if this is the first time we've visited level i,
             * we must have seen level 0 through level i-1. We can therefore safely add the level to the end */
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        list.add(root);

        /* recurse through the levels of the subtrees */
        createLevelLinkedList(root.left, lists, level+1);
        createLevelLinkedList(root.right, lists, level+1);
    }

    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
        createLevelLinkedList(root, lists, 0);
        return lists;
    }

    private static void printResult(ArrayList<LinkedList<TreeNode>> result) {
        int depth = 0;
        for (LinkedList<TreeNode> entry : result) {
            Iterator<TreeNode> i = entry.listIterator();
            System.out.print("Link list at depth " + depth + ":");
            while (i.hasNext()) {
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
