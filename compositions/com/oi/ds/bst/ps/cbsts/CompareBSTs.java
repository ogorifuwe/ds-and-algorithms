/**
 * Problem Statement: Write an efficient algorithm that's able to compare
 * two binary search trees. The method returns true if the trees are identical
 * (same topology with same values in the nodes) otherwise it returnss false.
 */
package com.oi.ds.bst.ps.cbsts;

import com.oi.ds.bst.Node;

public class CompareBSTs<T extends Comparable> {

  public boolean compareBSTs(Node<T> node1, Node<T> node2) {
    
    // base case
    if ((node1 == null && node2 == null) || 
      (node1 != null && node2 == null) ||
      (node1 == null && node2 != null))
      return node1 == node2;

    if (node1.element.compareTo(node2.element) != 0)
      return false;

    return compareBSTs(node1.leftChild, node2.leftChild) &&
      compareBSTs(node1.rightChild, node2.rightChild);
  }

}
