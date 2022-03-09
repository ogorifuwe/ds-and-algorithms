package com.oi.ds.linkedlist.dll;

import com.oi.ds.linkedlist.dll.List;
import com.oi.ds.linkedlist.dll.DoublyLinkedList;

public class DoublyLinkedListApp {
  
  public static void main(String[] args) {
    
    List<String> cities = new DoublyLinkedList<>();

    cities.insertHead("Chicago");
    cities.insertHead("New York");
    cities.insertHead("Los Angeles");
    cities.insertHead("Dallas");
    cities.traverseForward();
    System.out.println("Capacity: " + cities.size());
    System.out.println();

    String favoriteCity = cities.get(3);
    System.out.format("My favorite city is %s\n", favoriteCity);

    cities.remove("New York");
    cities.traverseForward();
    System.out.println("Capacity: " + cities.size());
    System.out.println();

    cities.remove("Los Angeles");
    cities.traverseForward();
    System.out.println("Capacity: " + cities.size());
    System.out.println();

    cities.remove("Chicago");
    cities.traverseForward();
    System.out.println("Capacity: " + cities.size());
    System.out.println();
  }
}
