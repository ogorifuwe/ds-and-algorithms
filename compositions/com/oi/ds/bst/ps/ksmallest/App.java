package com.oi.ds.bst.ps.ksmallest;

import com.oi.ds.bst.Node;
import com.oi.ds.bst.BinarySearchTree;

public class App {

  public static void main(String[] args) {

    BinarySearchTree<Integer> bst = new BinarySearchTree<>(); 
    bst.insert(1);
    bst.insert(4);
    bst.insert(12);
    bst.insert(5);
    bst.insert(20);

    KthSmallest<Integer> kthSmallestHelper = new KthSmallest<>();
    Node<Integer> kthSmallestNode = kthSmallestHelper.findKthSmallest(bst.getRoot(), 2);
    Integer result = kthSmallestNode.element;

    System.out.println("kthSmallest: " + result);
  }
}
