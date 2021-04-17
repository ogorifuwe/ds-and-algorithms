/**
 * Problem Statement: Write an efficient in-place algorithm to find the
 * k-th smallest (largest) item in a binary search tree.
 *
 */
package com.oi.ds.bst.ps.ksmallest;

import com.oi.ds.bst.Node;

public class KthSmallest<T extends Comparable<T>> {

  public Node<T> findKthSmallest(Node<T> node, int k) {
    
    T element = null;

    // get the size of left subtree.
    int n = 1 + treeSize(node.leftChild); // NB + 1 for root node 

    if (n == k) {
      return node;
    }

    // if the number of elements in the left subtree > k
    // k is in left subtree
    else if (n > k) {
      return findKthSmallest(node.leftChild, k);
    } else if (n < k) {
      // if the number of nodes in the left subtree < k
      // we can discard the left subtree and consider the right
      // subtree. We will find the k-nth smallest item
      return findKthSmallest(node.rightChild, k-n);
    }

    return null;
  }

  // calculate the size of a subtree with root node 'node'
  private int treeSize(Node<T> node) {
    
    // base case
    if (node == null) return 0;

    // size of tree = 1 + size of left subtree + size of right subtree
    return 1 + treeSize(node.leftChild) + treeSize(node.rightChild);
  }
}
