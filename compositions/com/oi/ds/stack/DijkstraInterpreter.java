package com.oi.ds.stack;

import java.util.Stack;

public class DijkstraInterpreter {

  private Stack<String> operationStack;
  private Stack<Double> valueStack;

  public DijkstraInterpreter() {
    
    this.operationStack = new Stack<>();
    this.valueStack = new Stack<>();
  }

  public void interpretExpression(String expression) {
    
    String[] expressionArr = expression.split(" ");

    for (String s : expressionArr) {
      
      if (s.equals("(")) {
        // do nothing
      } else if (s.equals("+")) {
          this.operationStack.push(s);
      } else if (s.equals("*")) {
          this.operationStack.push(s);
      } else if (s.equals(")")) {
          String operation = this.operationStack.pop();
          if(operation.equals("+")) {
            Double val0 = this.valueStack.pop();
            Double val1 = this.valueStack.pop();
            this.valueStack.push(val0 + val1);
          } else if (operation.equals("*")) {
              Double val0 = this.valueStack.pop();
              Double val1 = this.valueStack.pop();
              this.valueStack.push(val0 * val1);
          }
      } else {
          valueStack.push(Double.parseDouble(s));
      }
    }
  }


  public void displayResult() {
  
    System.out.println(valueStack.pop());
  }
}
