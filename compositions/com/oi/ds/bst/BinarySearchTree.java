package com.oi.ds.bst;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

  private Node<T> root;

  @Override
  public void insert(T element) {
    if (root == null) {
      root = new Node<>(element, null);
    } else {
        insert(element, root);
    }
  }

  @Override
  public void remove(T element) {

  }

  @Override
  public void traverse() {

  }

  @Override
  public T getMin() {

  }

  @Override
  public T getMax() {

  }

  private void insertElement(T element, Node<T> node) {
    
    if (node.element.compareTo(element) > 0) {
      if (node.leftChild != null) {
        insert(element, node.leftChild);
      } else {
          leftChild = new Node<T>(element, node);
      }
    } else {
        if (node.rightChild != null) {
          insert(element, node.rightChild);
        } else {
            rightChild = new Node<T>(element, node);
        }
    }
  }

}
