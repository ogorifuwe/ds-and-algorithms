/**
 * Find the middle node in a linked list. Construct an in-place
 * (without extra memory) algorithm that's able to find the middle node.
 */
package com.oi.ds.linkedlist.ps;

import com.oi.ds.linkedlist.sll.Node;
import com.oi.ds.linkedlist.sll.LinkedList;

public class FindMiddleNode<T extends Comparable<T>> {

  // time complexity: O(n)
  // space complexity: O(1)
  public Node<T> findMiddleNode2(LinkedList<T> list) {
    
    Node<T> slowFinger = list.root;
    Node<T> fastFinger = list.root;

    while(fastFinger.getNextNode() != null
          && fastFinger.getNextNode().getNextNode() != null) {
      slowFinger = slowFinger.getNextNode();
      fastFinger = fastFinger.getNextNode().getNextNode();
    }

    return slowFinger;
  }
}
