package com.oi.ds.bst.ps.cbsts;

import com.oi.ds.bst.BinarySearchTree;

public class App {

  public static void main(String[] args) {

    BinarySearchTree<Integer> bst1 = new BinarySearchTree<>();
    bst1.insert(2);
    bst1.insert(55);
    bst1.insert(67);
    bst1.insert(12);
    bst1.insert(11);
    
    BinarySearchTree<Integer> bst2 = new BinarySearchTree<>();
    bst2.insert(2);
    bst2.insert(50);
    bst2.insert(67);
    bst2.insert(12);
    bst2.insert(11);

    CompareBSTs<Integer> helper = new CompareBSTs<>();
    boolean result = helper.compareBSTs(bst1.getRoot(), bst2.getRoot());
    System.out.println("result: " + result);

  }
}
