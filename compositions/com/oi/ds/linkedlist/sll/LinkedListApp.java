package com.oi.ds.linkedlist.sll;

import com.oi.ds.linkedlist.sll.List;
import com.oi.ds.linkedlist.sll.LinkedList;

public class LinkedListApp {

  public static void main(String[] args) {
    
    List<Person> people = new LinkedList<>();

    Person p1 = new Person(12, "John");
    Person p2 = new Person(25, "Mary");
    Person p3 = new Person(37, "Peter");

    people.insert(p1);
    people.insert(p2);
    people.insert(p3);
    people.remove(p3);
    
    people.traverse();
    System.out.println(people.size());
  }
}
