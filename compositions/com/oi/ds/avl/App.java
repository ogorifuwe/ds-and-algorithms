package com.oi.ds.avl;

public class App {

  public static void main(String[] args) {
  
    BinarySearchTree<Integer> bst = new BinarySearchTree<>();
    bst.insert(12);
    bst.insert(4);
    bst.insert(20);
    bst.insert(1);
    bst.insert(8);
    bst.insert(16);
    bst.insert(27);

    bst.traverse();


    // print root of tree
    Node<Integer> root = bst.root;
    System.out.println("root: " + root);

    // test get min method
    Integer minData = bst.getMin();
    System.out.println("Minimum Data: " + minData);

    //test get max method
    Integer maxData = bst.getMax();
    System.out.println("Maximum Data: " + maxData);


    // test delete method
    bst.delete(27);
    bst.traverse();

  }
}
