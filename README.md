# java-design-patterns

## What is Design Pattern?

* **Industry Standard Approach** to solve a recurring problem in Software.
* Design patterns promotes reusability that leads to more **robust** and highly maintainable code.
* It makes the code easy to understand, debug and help in faster development. New Team member understand it easily.

## Types of Design Pattern
* **Creational Design Pattern:** This provides different approach or ways to create the object in best possible and loose coupled manner.
    * Singleton Pattern
    * Factory Pattern
    * Abstract Factory Pattern
    * Builder Pattern
    * Prototype Pattern
* **Structural Design Pattern:** This explains about the ways how objects and classes can be combined to build a large application structure.
    * Adapter Pattern
    * Bridge Pattern
    * Decorator Pattern
    * Facade Pattern
    * Composite Pattern
    * Proxy Pattern
    * Flyweight Pattern
* **Behavioral Design Pattern:** This provides solution for the better interaction between objects and how to provide loose coupling and flexibility to extend easily. This is mainly about communication between the classes in loose coupled manner.
    * Chain of Responsibility Pattern
    * Template Method Pattern
    * Observer Pattern
    * Strategy Pattern
    * Mediator Pattern
    * Command Pattern
    * State Pattern
    * Visitor Pattern
    * Interpretor Pattern
    * Iterator Pattern
    * Memento Pattern

## Singleton Design Pattern
* This ensure that only one instance of the class exists in the JVM.
* Steps to create Single Pattern:
    * Create a private constuctor to restrict intstantiation of the class from other classes.
    * Create private static variable of the same class that is the only instance of the class.
    * Create public static method that returns the instance of the class and this is global access point for others to get the instance of the singleton class.
* Make sure that singleton class must provide a global access point to get the instance.
    * [Eager initilization](src/main/java/com/ysingh/creational/singleton/eagerinitialization/Singleton.java)
    * [Static block initialization](src/main/java/com/ysingh/creational/singleton/staticinitialization/Singleton.java)
    * [Lazy initilization](src/main/java/com/ysingh/creational/singleton/lazyinitialization/Singleton.java)
    * [Thread Safe Singleton](src/main/java/com/ysingh/creational/singleton/threadsafe/Singleton.java)
    * [Bill Pugh Singleton Implementation]
    * [Enum Singleton]
    * [Using Reflection to destroy singleton]
    * [Using clone to destroy/prevent singleton]
    * [Using serialization destory/prevent singleton]
    * Example of Singleton Within JDK





