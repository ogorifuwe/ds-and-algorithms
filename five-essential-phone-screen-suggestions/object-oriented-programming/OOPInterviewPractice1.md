* What is a class and what is an object? Can you tell me the differences between them?
  
  * Class
    
    * A class is a sofware design of a real world object or concept that the software is modelling. It
      describes the properties of the object or concept using attributes and methods.
    * On a high-level, it can be described as an abstraction or a collection of objects. 

  * Object

    * An object is an instance of a class. They are instantiated or created from a class.
    * On a high level, an object is a single instance of a class at runtime.
    * In Java, the new operator is used to invoke the object's constructor, allocate memory and return
      a reference to that memory.


* What is instantiation?

  * Instantiation is the process of instantiating or creating an object from a class.
  * In Java, the new Operator is used to invoke the object's constructor, allocate memory for the new object
    and return a reference to that memory.

* What is a method?

  * A method is a piece of code that is associated with an object and is referred to by its name.
  * It can be called or invoked at any point in the program simply by utilizing the method's name
    to perform a specific action.
  * It is similar to a C's function, except;
    * It is implicitly passed an instance of the class to which it is called on.
    * It is able to operate on data that is contained within the class.

* What is a class or static Method?

  * A class or static method is a method that is available for use without an instantation of an object
    from its class, unlike an instance method that is only available able an instance of the class is created.
  * A class method belongs to the class in which it is declared and defined, whereas an instance method belongs
    to the instance of the class.

* What is a constructor?

  * A constructor is a block of code that is similar to a method.
  * It has the same name as its class.
  * It does not have a return type.
  * It is used to create or instantiate an object of its clas.
  * It can have multiple variable types and number of parameters.
  * It can be overloaded.
  * It is advisable to create a parameterless default constructor when creating other constructors.
  * If a constructor is not created, the compiler creates a default constructor for the class.
  

* What is a superclass?

  * A superclass is a class from which another class inherits code (methods and attributes).
  * It can also be referred to as a parent or root class.

* What is a subclass?

  * A subclass is a class that inherits code (methods and attributes) from an already existing class.
  * It can also be referred to as a child or derived class.

* What is inheritance?

  * Inheritance is a mechansm wherein a new class is derived from an existing class.
  * It allows the new class to inherit the methods and attributes of the existing class.
  * The already existing class is referred to as a superclass, while the new class is
    referred to as a subclass.

* What is encapsulation?

  * Encapsulation is the act of information hiding. It provides a protective shield that prevents
    code that is outside the shield from accessing code that is inside the shield.
  * It can be defined as the wrapping up of data under a single unit. It is a mechanism that binds
    code and the data it manipulates together.
  * It is usually achieved by declaring all the attributes of the class as private and providing public
    access modifiers (getters and setters) for manipulating the attributes.

* What is multiple inheritance?

  * Multiple inheritance is the concept of deriving a new class from multiple existing classes. i.e. a
    subclass inherits methods and attributes from multiple superclasses.
  * The diamond problem occurs when there exists:
    * Methods with the same signature in more than one superclass.
    * On calling the method, the compiler cannot determine which superclass' method to invoke and
      even on invoking, which superclasses' method

  
