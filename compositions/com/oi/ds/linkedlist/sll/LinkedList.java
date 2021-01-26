package com.oi.ds.linkedlist.sll;

import com.oi.ds.linkedlist.sll.List;
import com.oi.ds.linkedlist.sll.Node;

public class LinkedList<T extends Comparable<T>> implements List<T> {
  
  private Node<T> root; // this is the head node
  private int numOfItems; // size of the linkedlist

  @Override
  public void insert(T data) {
    if (root == null) {
      root = new Node<>(data);
    } else {
        insertBeginning(data);
    }
    ++numOfItems;
  }

  @Override
  public void remove(T data) {

    if (root == null) {
      return;
    }

    if (root.getData().compareTo(data) == 0) {
      root = root.getNextNode();
    } else {
        remove(data, root, root.getNextNode());
    }
    --numOfItems;
  }

  @Override
  public void traverse() {
    if (root == null) {
      return;
    }
    
    Node<T> currNode = root;
    while (currNode != null) {
      System.out.print(currNode);
      currNode = currNode.getNextNode();
    }
  }

  @Override
  public int size() {
    return numOfItems;
  }

  // utility for inserting a node at head of list in O(1) time
  private void insertBeginning(T data) {
    Node<T> newNode = new Node<>(data);
    newNode.setNextNode(root);
    root = newNode;
  }

  // utility for inserting a node at tail of list in O(N) time
  private void insertEnd(T data, Node<T> node) {
    
    if (node.getNextNode() != null) {
      insertEnd(data, node);
    } else {
        Node<T> newNode = new Node<>(data);
        node.setNextNode(newNode);
    }
  }

  // utility for removing a node from list in O(N)
  private void remove(T data, Node<T> prevNode, Node<T> currNode) {
    while(currNode != null) {
      if (currNode.getData().compareTo(data) == 0) {
        prevNode.setNextNode(currNode.getNextNode());
        currNode = null;
       return;
      } else {
          prevNode = currNode;
          currNode = currNode.getNextNode();
      }
    }
  }
}
