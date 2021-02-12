package com.oi.ds.stack;

public class AppStack {

  public static void main(String[] args) {
    
    StackNode<String> names = new StackNode<>();
    names.push("Paulie");
    names.push("Peter");
    names.push("Paul");
    names.push("Michael");

    while(!names.isEmpty()){
      System.out.println(names.pop());
    }

    StackArray<Integer> numbers = new StackArray<>();
    numbers.push(1);
    numbers.push(2);
    numbers.push(3);
    numbers.push(4);
    numbers.push(5);
    numbers.push(6);

    Integer top = numbers.peek();
    System.out.println(top);

    Integer removedTop = numbers.pop();
    System.out.println(removedTop);


    Integer newTop = numbers.peek();
    System.out.println(newTop);
  }
}
