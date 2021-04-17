/**
 * Problem Statement: Write an efficient algorithm to calculate the total sum
 * of ages in a family tree. A family tree is a binary search tree in this case
 * where all the nodes contain a Person object with [name, age] attributes.
 */
package com.oi.ds.bst.ps.familyage;

import com.oi.ds.bst.Node;

public class FamilyAge<T extends Comparable<T>> {

  public int calFamilyAgesSum(Node<T> node) {
    
    return getAgesSum(node);
  }

  private int getAgesSum(Node<T> node) {

    int treeSum = 0;
    int leftSubtreeSum = 0;
    int rightSubtreeSum = 0;

    // base case: null nodes have sum = 0;
    if (node == null) {
      return 0;
    }
    
    leftSubtreeSum = getAgesSum(node.leftChild);
    rightSubtreeSum = getAgesSum(node.rightChild);
    System.out.println((Person)node.element);
    treeSum = ((Person)node.element).age + leftSubtreeSum + rightSubtreeSum;

    return treeSum;
  }
}
