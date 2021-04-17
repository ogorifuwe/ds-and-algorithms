package com.oi.ds.bst;

public class App {

  public static void main(String[] args) {

    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.insert(12);
    tree.insert(4);
    tree.insert(20);
    tree.insert(1);
    tree.insert(8);
    tree.insert(16);
    tree.insert(27);

    System.out.println(tree.getMin());
    System.out.println(tree.getMax());
    tree.remove(16);
    tree.traverse();
  }
}
