/**
 * Construct an in-place algorithm (without the need for extra memory)
 * to reverse a Linked List.
 */
package com.oi.ds.linkedlist.ps;

import com.oi.ds.linkedlist.sll.Node;
import com.oi.ds.linkedlist.sll.LinkedList;

public class ReverseLinkedList<T extends Comparable<T>> {


  public LinkedList<T> reverse(LinkedList<T> list) {
    
    Node<T> currNode = list.root;
    Node<T> prevNode = null;
    Node<T> nextNode = null;

    while(currNode != null) {
      nextNode = currNode.getNextNode();
      currNode.setNextNode(prevNode);
      prevNode = currNode;
      currNode = nextNode;
    }

    list.root = prevNode;

    return list;
  }

}
