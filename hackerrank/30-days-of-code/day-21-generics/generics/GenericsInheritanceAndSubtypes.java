public class GenericsInheritanceAndSubstypes {

  Object someObject = new Object();
  Integer someInteger = new Integer(10);
  someObject = someInteger; // OK

  public void someMethod(Number n) { /* ... */ }

  someMethod(new Integer(10));    // OK
  someMethod(new Double(10.1));   // OK

  Box<Number> box = new Box<Number>();
  box.add(new Integer(10));    // OK
  box.add(new Double(10.1));   // OK

  public void boxTest(Box<Number> n) { /* ... */ }

  Box<Integer> box0 = new Box<Integer>();
  Box<Double> box1 = new Box<Double>();

  boxTest(box0);
  boxTest(box1);

}

interface PayloadList<E, P> extends List<E> {
  void setPayload(int index, p val);
  ...
}

public class Payload<E, P> implements PayLoadList<E, P> {
    
  PayloadList<String, String>
  PayloadList<String, Integer>
  PayloadList<String, Exception>
}
