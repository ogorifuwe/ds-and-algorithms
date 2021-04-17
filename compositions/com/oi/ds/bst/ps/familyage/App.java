package com.oi.ds.bst.ps.familyage;

import com.oi.ds.bst.BinarySearchTree;
import com.oi.ds.bst.Node;
import com.oi.ds.bst.ps.familyage.Person;

public class App {

  public static void main(String[] args) {

    java.util.List<Person> familyList = java.util.Arrays.asList(
        new Person("Adam", 47),
        new Person("Kevin", 21),
        new Person("Joe", 55),
        new Person("Arnold", 20),
        new Person("Noel", 34),
        new Person("Marko", 68),
        new Person("Susan", 23),
        new Person("Rose", 38)
      ); 
  
    BinarySearchTree<Person> bst = new BinarySearchTree<>();

    int i = 0;
    while (i < familyList.size()) {
      Person person = familyList.get(i);
      bst.insert(person);
      ++i;
    }

    FamilyAge<Person> familyAge = new FamilyAge<>();
    int familyAgeSum = familyAge.calFamilyAgesSum(bst.getRoot());
    System.out.println("Sum: " + familyAgeSum);

  }
}
