package com.oi.ds.linkedlist.ps;

import com.oi.ds.linkedlist.sll.Node;
import com.oi.ds.linkedlist.sll.List;
import com.oi.ds.linkedlist.sll.LinkedList;

public class AppFindMiddleNode {

  public static void main(String[] args) {
    
    LinkedList<String> citiesList = new LinkedList<>();
    citiesList.insert("Chicago");
    citiesList.insert("New York");
    citiesList.insert("Los Angeles");
    citiesList.insert("San Francisco");
    citiesList.insert("Las Vegas");
    citiesList.insert("Miami");

    FindMiddleNode fmn = new FindMiddleNode();

    Node<String> res0 = fmn.findMiddleNode2(citiesList);
    System.out.println(res0.toString());
    System.out.println();
    
    citiesList.traverse();
    System.out.println();

    ReverseLinkedList rll = new ReverseLinkedList();
    LinkedList res1 = rll.reverse(citiesList);
    res1.traverse();
  }
}
