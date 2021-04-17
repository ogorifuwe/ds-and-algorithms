package com.oi.ds.bst.ps.familyage;

public class Person implements Comparable<Person> {

  protected String name;
  protected int age;

  public Person() {}

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Person person) {
    return (this.age - person.age);
  }

  @Override
  public String toString() {
  
    return "[ name: "+ this.name + ", age: " + this.age + " ]";
  }
}
