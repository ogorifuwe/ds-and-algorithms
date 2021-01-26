package com.oi.ds.linkedlist.sll;

import com.oi.ds.linkedlist.sll.List;
import com.oi.ds.linkedlist.sll.LinkedList;

public class LinkedListApp {

  public static void main(String[] args) {
    
    List<String> names = new LinkedList<>();

    names.insert("John");
    names.insert("Mary");
    names.insert("Peter");

    names.traverse();
    System.out.println();
  }
}
