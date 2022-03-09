package com.oi.ds.linkedlist.dll;

import com.oi.ds.linkedlist.dll.List;

public class DoublyLinkedList<T extends Comparable<T>>
  implements List<T> {

  private Node<T> head;
  private Node<T> tail;
  private int capacity;

  @Override
  public void insertHead(T data) {
    
    Node<T> newNode = new Node<>(data);

    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
        head.setPreviousNode(newNode);
        newNode.setNextNode(head);
        head = newNode;
    }

    ++capacity;
  }

  @Override
  public void insertTail(T data) {

    Node<T> newNode = new Node<>(data);

    if (tail == null) {
    
      tail = newNode;
      head = newNode;
    } else {
        tail.setNextNode(newNode);
        newNode.setPreviousNode(tail);
        tail = newNode;
    }

    ++capacity;
  }

  @Override
  public T get(int index) {
    if (index < 0 || index >= capacity) return null;

    Node finger = head;
    if (index < capacity - index) 
      for (int i = 0; i < index; ++i) finger = finger.getNextNode();
    else {
      finger = tail;
      for (int i = 0; i < capacity - index - 1; ++i) finger = finger.getPreviousNode();
    }
    return (T)(finger.getData());
  }

  @Override
  public void remove(T data) {
   
    Node<T> currNode = head;

    if (currNode == null) {
      return;
    } else if (capacity == 2 && currNode.getData().compareTo(data) == 0) {
        removeHead();
        return;
    } else if (capacity == 2 && currNode.getNextNode().getData().compareTo(data) == 0) {
        removeTail();
        return;
    }

    while (currNode != null) {
      if (currNode.getData().compareTo(data) == 0) {
        currNode.getPreviousNode().setNextNode(currNode.getNextNode());
        currNode.getNextNode().setPreviousNode(currNode.getPreviousNode());
        currNode = null;
        --capacity;
        return;
      } else {
          currNode = currNode.getNextNode();
      }
    }

  }

  @Override
  public void removeHead() {
    
    Node<T> currNode = head;

    head = currNode.getNextNode();
    head.setPreviousNode(null);
    currNode = null;    
    --capacity;
  }

  @Override
  public void removeTail() {

    Node<T> currNode = tail;

    tail = currNode.getPreviousNode();
    tail.setNextNode(null);
    currNode = null;
    --capacity;
  }

  @Override
  public void traverseForward() {
    
    Node<T> currNode = head;

    if (currNode == null) {
      return;
    }

    while(currNode != null) {
      System.out.println(currNode);
      currNode = currNode.getNextNode();
    }
  }

  @Override
  public void traverseBackward() {
    
    Node<T> currNode = tail;

    if (currNode == null) {
      return;
    }

    while(currNode != null) {
      System.out.println(currNode);
      currNode = currNode.getPreviousNode();
    }
  }

  @Override
  public int size() {
  
    return capacity;
  }

  private void removeUtil(T data, Node<T> previousNode, Node<T> currentNode, Node<T> nextNode) {
    
    while(currentNode != null) {
      if (currentNode.getData().compareTo(data) == 0) {
        previousNode.setNextNode(nextNode);
        nextNode.setPreviousNode(previousNode);
        currentNode = null;
        return;
      } else {
          previousNode = currentNode;
          currentNode = nextNode;
          nextNode = nextNode.getNextNode();
      }
    }
  }
}
