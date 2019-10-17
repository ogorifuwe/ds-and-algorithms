Definitions:

1. Class, object (and the difference between the two)
  
  * A class generalizes or abstracts a collection of objects. Classes
    provide blueprints for constructing objects - they act as software
    models for real world things or concepts. They specify data elements
    (attributes, instance variables) and operations (methods) for resulting
    objects. A class can instantiate(construct) a number of objects. 
     
  * A 'class' is a software design which describes the properties (methods
    & behaviors) of something which the software is modelling.

  * Individual 'objects' are created from the class design for each
    actual thing. Put another way, an object is an instance of a class.


2. Instantiation

  * Is simply creating an object of/from class. In Java, the 'new' operator
    is used to allocate memory for the object and return a reference to that
    memory. It also invokes the object constructor.
    

3. Method (as opposed to, say a C function)

  * A method can be described as a piece of code that is called by a name
    that is associated with an object. In most respects it is identical to
    a function except:

    i.  A method is implicitly passed the object on which is it called.
    ii. A method is able to operate on data that is contained within the
        class (remembering that an object is an instance of a class - the
        class is the definition, the object is an instance of that data).
        
  * A function is a piece of code that is called by name. It can be passed
    data to operate on (i.e the parameters) and can optionally return data
    (the return value). All data that is passed to a function is explicitly
    passed. (In summary a function is independent of a class/object).


4. Virtual method, pure virtual method

  * A virtual method is a method whose implementation can be overridden in
    a sub-class that extends/inherits its class. (It is essentially a Java
    abstract, only an abstract class must be overridden).

  * A pure virtual method is a method that must be overridden by the sub
    class which is inheriting it. It only has a method declaration, without 
    a definition. It is exactly the same as a Java abstract class.


5. Class/static method

  * A static method is a method that belongs to the class in which it is
    declared and defined, unlike  an instance method that belongs to an
    object/instance of the class - meaning an instance of the class must
    be created before the method is available for use/invocation. A class/
    static method is available for use within the class without instantia-
    ting an object of the class.


6. Static/class initializer

  * A static initializer is used to create a static block. The code inside
    a static block is executed only once: the first time you make an object
    of the class or the first time you access a static member of that class
    (even if you never make an object of that class).


7. Constructor

  * A constructor is a block of code similar to a method, that is called
    when an object is created.
    
    i.  Constructors do not have return types.
    ii. They take parameters - which are mostly always instance variables.
    iii.Unlike methods, they are considered members of a class.


8. Destructor/finalizer

  * A destructor/finalizer is used to perform any necessary final clean-up
    when a class instance is being collected by the garbage collector.


9. Super class or base class

  * A supper class or base class is a class from which other classes
    inherit code. It can also be referred to as a parent class.


10. Subclass or derived class

  * A subclass or derived class is a class that inherits code from a
    super class. It can also be referred to a as a child class.


11. Inheritance

  * Inheritance is a mechanism wherein a new class is derived from an exist-
    ing class. Classes may inherit or acquire the properties and methods of
    other classes. A class derived from another class is called a subclass,
    whereas a class from which a subclass is derived is called a superclass.
    

12. Encapsulation 

  * Hiding implementation, combining data(attributes) and operations
    (methods), protecting data.
    {The act of using getters and setters to hide data}
    - Encapsulation can be defined as the wrapping up of data under a
      single unit. It is the mechanism that binds together code and the
      data it manipulates. Other way to think about encapsulation is, it
      is a protective shield that prevents the data from being accessed
      by code outside the shield.

      - Technically in encapsulation, the variables or data of a class is
        hidden from any other class and can be accessed only through any
        member function of own class in which they are declared.

      - In encapsulation, the data in the class is hidden from other
        classes, so it also known as data-hiding.

      - Encapsulation can be achieved by declaring all the variables in
        the class as private and writing public methods in the class to
        set and get the values of variables.


13. Multiple inheritance (and give an example)

  * Multiple inheritance is the capabilty/concept of creating a single class
    with multiple superclasses.
    Multiple inheritance is a concept where a class can inherit properties
    of more than one parent class. A diamond problem occurs when there exist
    methods with same signature in both the super classes and subclasses.
    On calling the method, the compiler cannot determine which class method
    to be called and even on calling which class method get priority.


 14. Delegation/forwarding
 
  *   Delegation is simply passing a duty off to someone/something else.
  
    * Delegation can be an alternative to inheritance.
    * Delegation means that you use an object of another class as an ins-
      tance variable, and forward messages to the instance.
    * It is better than inheritance for many cases because it makes you
      think about each message you forward, since the instance is of a
      known class, rather than a new class. It does not force you to accept
      all the messages of the super class: you provide only the methods
      that really make sense to your implementation.
    * Delegation can be viewed as a relationaship between objects where
      one object forwards certain method calls to another object, called
      its delegate.
    * The primary advantage of delegation is runtime flexibility - the
      delegate can easily be changed at runtime. But unlike inheritance,
      delegation is not directly supported by most popular object-oriented
      languages, and it does not facilitate dynamic polymorphism.   


15. Composition/Aggregation

  * A "owns" B = Composition: B has no meaning or purpose without A.
    i.e, it cannot exist independent of A.
    
  * A "uses" B = Aggregation: B exists independently (conceptually) of A.
  

16. Abstract class

  * An abstract class is a class that is declared abstract. It may or may
    not include abstract methods. An abstract cannot be instantiated, but
    they can be extended(inherited)/subclassed
    - An abstract class provide a contract between a service provider and
      its clients.
      
    - An abstract method is a method that is declared without an implemen-
      tation (without braces, and followed by a semicolon)
      
17. Interface/protocol

  * An interface is a blueprint of a class. It is mostly a collection of
    abstract methods. An interface can be used to acheive abstraction and
    multiple inheritance, by providing default methods, abstract methods,
    static constants.


18. Method Overriding

  * Method overriding is a concept that allows a subclass or child class
    to provide its own implementation of a method that is already provided
    by its super class or parent class 


19. Method Overoloading

  * Method overloading allows a different method to have the same name,
    but different signatures where signature can differ by the number of
    input parameters or type of input parameters or both.

      - Overloading is related to compile time (or static) polymorphism.


20. Polymorphism

  * Polymorphism is a concept, where the subclasses of a class can define
    there own unique behaviors and yet share some of the same functionali-
    ty of the parent class.


21. Is-a versus has-a relationship

  * An is-a relationship is inheritance. The classes which inherit are
    known as sub classes or child classes. On the other hand, has-a rela-
    tionship is composition.

    In OOP, is-a relationship is completely inheritance. This means, that
    the child class is a type of the parent class. e.g. an Apple is a Fruit.
    So, you will extends a Fruit to create an Apple.

    class Apple extends Fruit {
      ...  
    }

    On the other hand, composition means creating instances which have refe-
    rences to other objects. For example, a room has a table. So you will
    create a class room and then in that class create an instance of type
    table.

    class Room {
      ...
      Table t = new Table();
      ...  
    }

    Has-a relationship is dynamic (runtime) binding while inheritance is a
    static (compile time) binding. If you want to reuse the code and you
    know that the two are not of same kind use composition. For example,
    you cannot create an oven from a kitchen. A kitchen has-a oven. When
    you feel there is a natural relationship like Apple is a Fruit, use
    inheritance.


22. Method signatures (what's included in one)

  * Method signature is the method name and the number, type and order
    of its parameters. Return types and thrown exceptions are not consi-
    dered to be a part of the method signature


23. Method Visibility

  i.  public: global access
  
  ii. private: package/class level access
  
  iii.protected: Default/package level access


23. Method visibility (e.g. public/private/other)
    
    -----------------------------------------------------
    | Modifier    | class | package | subclass  | world |
    -----------------------------------------------------
    | public      |   Y   |    Y    |     Y     |   Y   |
    -----------------------------------------------------
    | private     |   Y   |    N    |     N     |   N   |
    -----------------------------------------------------
    | protected   |   Y   |    Y    |     Y     |   N   |
    -----------------------------------------------------
    | default     |   Y   |    Y    |     N     |   N   |
    -----------------------------------------------------


For OO-design weeder question, have them describe:    

1. What classes they would define
2. What methods go in each class(including signatuere)
3. What the class constructors are responsible for
4. What data structures the class will have to maintain
5. Whether any design patterns are applicable to this problem
