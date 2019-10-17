## What is a class?

  * A class is a software design which describes the properties(in terms of methods and attributes)
    of a real world object or concept that a software is modelling.

 ## What is an object?

  * A object is an instance of a class. After the design of a class/blueprint of an object/concept, such class
    is used for interactivity in the form of an object, allowing various instances of the class to be used at
    the same time if need be.

  ## What is instantiation?

    * In instantiation is the process of creating an instance of a class (or an object).
      In java, the "new" operator is used to;
        * allocate memory for the object and return a reference to that memory
        * invoke the constructor of the  

  ##  Method (as opposed to a C function)
  
    * A method is a peice of code that is called by a name that is associated with an object.
      In most cases, it is identical to a function except:
      
      i.  A method is implicitly passed the object on which it is called.
      ii. A method is able to operate on data that is contained within the class (remembering that an object is
          an instance of a class - the class is the definition, the object is an instance of that data).
          
  ## What is a function
  
    * A function is a piece of code that is called by name. It can be passed data to operate on
      (i.e parameters) and it can return data, i.e the return value. All the data that is passed
      to a function is explicitly passed. A function is independent of its class/object.
      
  ## What is a class/static method.
  
    * A static method is a method that belongs to the class in which is declared and defined,
      unlike an instance method that belongs to the instance of an object/instance of the class -
      meaning an instance of the class must be created before the method to be available for use/invocation.
      A class/static method is available for use within the class without instanting an object of its class.

  ## Static/class initializer

    * A static/class initializer is used to create a static block of code. A static block of code
      is only executed once: the first time an instance of its class is created is created or the first
      time you access a static member of that class(even if you never make an object of that class).

  ## Constructor

    * A constructor is a block of code similar to a method, that is called when an object of the class
      is created.

      i.    A constructor does not have a return type.
      ii.   They take parameters which are mostly instance variables
      iii.  Unlike methods, constructors are considered members of the class

  ## Destructor/finalizer

    * A destructor is used for final clean up when an instance of a class is being collected by
      the garbage collector

  ## What is a super class or base class

    * A super class is a class from which another class (referred to a its child class) inherits code
    (methods and attirbutes) from. It is referred to as a parent class.

  ## What is a subclass or derived class

    * A subclass or derived class is a class that inherits code (methods and attributes) from a
      super/base/parent class. It is referred to as a child class.

  ## What is Inheritance

    * Inheritance is a mechanism wherein a new class is derived from an existing class. Classes may inherit
      or acquire the properties and methods of other classes. A class derived from another class is called
      a subclass, while a class from which a subclass is derived is called a super class.

  ## Encapsulation

    * I like to think of Encapsulation as the act of using getters and setters to implement information
      hiding. i.e Hiding the information(data) within a class so that it is not directly accessible to
      other classes/objects outside of it.

      In java, this is acheived by making the declaring the all the data in the class as private and creating
      public methods that can be used to manipilate the data that is within the class.

   ## Multiple Inheritance

    * Multiple inheritance is a concept where a subclass inherits the methods and attributes of more than
      one super class. The diamond problem occurs when there exist a method in both super classes with the
      same method signature. The compiler experiences difficulty figuring out which class' method to call
      or even on calling, which class' method to give priority to over the other.

  ## Delegation/call forwarding

    * Delegation is simply passing a duty off to someone or something else.
    * Delegation can be an alternative to inheritance
    * Delegation means that you can use the object of another class as an instance variable, and forward
      messages to the instance.
    * I think it is better than inheritance for many cases because it makes you think about each message
      you forward, since the instance is of a known class, rather than a new class. It does not force you
      to accept all the messages of the super class. You provide only the methods that really make sense
      to your implementation.
    * Delegation can be viewed as a relationship between objects where one object forwards certain method
      calls to another object, called its delegate.
    * The primary advantage of delgation is runtime flexibilty - the delegate can easily be changed at runtime.
      But unlike inheritance, delegationis not directly supported by most popular object-oriented languages,
      aand it does not facilitate dynamic polymorphism.

  ## Composition/Aggregation
  
    * A "owns" B == composition: B has no meaning without A. i.e B cannot exist independent of A
    * A "uses" B == aggregation: B exists independently (conceptually) of A

  ## Abstract class

    * An abstract class is a class that is declared abstract. It may or may not include abstract methods.
      An abstract class cannot be instantiated, but it can be extended(inherited/subclassed)
        
        * An abstract class provides a contract between a service provider and its clients.
        
        * An abstract method is a method that is declared abstract without an implementation (without
          braces and followed by a semi colon)
        
  ## Interface/protocol
  
    * An interface is a blueprint of a class. It is mostly a collection of abstract methods. An interface
      can be used to acheieve abstraction and multiple inheritance, by providing default methods, abstract
      methods, static constants.
      
  ## Method Overriding
  
    * Method overriding is a concept that allows a subclass or a derived class to provide its own
      implementation of a method that is already provided by its super class or parent class.
      
  ## Method Overloading
  
    * Method overloading is a concept that allows a class to the different methods with the same name
       but different method signatures (where signatures can differ by the number of input parameters
       or type of input parameters or both).

       * Overloading is related to compile time or static polymorphism.

  ## Polymorphism

    * Polymorphism is a concept that allows subclasses of a class to define its own unique behaviors and
      yet share some of the same functionality of the parent class.
  
  ## Is-a vs has-a relationship
  
    * An is-a relationship is inheritance. The classes which inherit are know as subclasses or child classes.
      On the otherhand, has-a relationship is composition.
      
      Composition is A own B. Meaning that B cannot exist independent of A.
      
      In OOP, is-a relationship is completely inheritance i.e the child class is a type of the parent class.
      e.g An Apple is a Fruit. Meaning to create an Apple class, we must extend the Fruit class.
      
      On the otherhand composition means creating instances which have references to other objects. For example,
      a room has a table. So you will create a class room and thrn in that class an instance of table.

      Has a relationship has dynamic (runtime) bindingi while inheritance has static (compile) binding.
      If you want to reuse the code and you know that the two are not the same kind use composition. For
      example, you cannot create an oven from a kitchen. A kitchen has-a oven. When you feel there is a
      natural relationship like Apple is a Fruit, use inheritance.

  ## Method Signatures (whats included in one)

    * Method signature is the method name and the number, type and order of its parameters.
      Return types and thrown exceptions are not considered to be a part of the method signature.

  ## Method Visibility

    * The method visibility of a method is distinguished by its access modifier. It is protected by default.
      It can be made public or private

      i   public: global access
      ii  private: class level access
      iii protected: default/package level access
      
      modifier    class   package   subclass    world
      public        Y       Y         Y           Y 
      private       Y       N         N           N
      protected     Y       Y         Y           N
      default       Y       Y         N           N
