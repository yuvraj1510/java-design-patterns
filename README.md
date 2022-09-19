# java-design-patterns

## What is Design Pattern?

* **Industry Standard Approach** to solve a recurring problem in Software.
* Design patterns promotes reusability that leads to more **robust** and highly maintainable code.
* It makes the code easy to understand, debug and help in faster development. New Team member understand it easily.

## Types of Design Pattern
* **Creational Design Pattern:** This provides different approach or ways to create the object in best possible and loose coupled manner.
    * [Singleton Pattern](src/main/java/com/ysingh/creational/singleton)
    * [Factory Pattern](src/main/java/com/ysingh/creational/factory)
    * [Abstract Factory Pattern](src/main/java/com/ysingh/creational/abstractfactory)
    * [Builder Pattern](src/main/java/com/ysingh/creational/builder)
    * [Prototype Pattern](src/main/java/com/ysingh/creational/prototype)
* **Structural Design Pattern:** This explains about the ways how objects and classes can be combined to build a large application structure.
    * [Adapter Pattern](src/main/java/com/ysingh/structural/adapter)
    * Bridge Pattern
    * Decorator Pattern
    * Facade Pattern
    * [Composite Pattern](src/main/java/com/ysingh/structural/composite)
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
### Implementations:
* [Eager initilization](src/main/java/com/ysingh/creational/singleton/eagerinitialization/Singleton.java)
* [Static block initialization](src/main/java/com/ysingh/creational/singleton/staticinitialization/Singleton.java)
* [Lazy initilization](src/main/java/com/ysingh/creational/singleton/lazyinitialization/Singleton.java)
* [Thread Safe Singleton](src/main/java/com/ysingh/creational/singleton/threadsafe/Singleton.java)
* [Bill Pugh Singleton Implementation](src/main/java/com/ysingh/creational/singleton/billpugh/Singleton.java)
* [Enum Singleton](src/main/java/com/ysingh/creational/singleton/usingenum/Singleton.java)
* [Using Reflection to destroy singleton](src/main/java/com/ysingh/creational/singleton/destroy/TestApp.java)
* [Using clone to destroy singleton](src/main/java/com/ysingh/creational/singleton/destroy/TestApp.java)
* [Using serialization destory singleton](src/main/java/com/ysingh/creational/singleton/destroy/TestApp.java)
* [Using clone to prevent singleton](src/main/java/com/ysingh/creational/singleton/clonable/TestApp.java)
* [Using serialization prevent singleton](src/main/java/com/ysingh/creational/singleton/serialization/TestApp.java)
### Example within JDK:
* Runtime.class
* Desktop.class
* System.class
* Logging
* Caching
* Thread Pools

## Factory Design Pattern
* This pattern is used when we have a super class with multiple sub-classes and based on input we need to return object of one of the sub-class.
* This takes out the responsibility of the instantiation of the class object from the client program to factory class.
### Implementation:
* [Example](src/main/java/com/ysingh/creational/factory/TestApp.java)
### Advantages:
* Factory design pattern is a way to code for interface rather than implementation.
* Factory design pattern moves the responsibility to instantiate the class implementation from client code to factory class.
* Factory design pattern makes our code more robust, less couples and easy to extend so we can easily change the implementation of base class because client is now aware of this.
### Examples within JDK:
* getInstance() method in java.util.Calendar class
* getInstance() method in java.text.NumberFormat class
* getConnection() method in java.sql.DriverManager class
* openConnection() method in java.net.URL class
* forName() method in java.lang.Class class
* newInstance() method in java.lang.Class class
* of() method in java.util.EnumSet class
* forName() method in java.nio.charset.Charset class
* getBundle() mthod in java.util.ResourceBundle class

## Abstract Factory Design Pattern
* Abstract Factory pattern is considered as another layer of abstraction over factory pattern.
* It is more like factory of factories.
* Whenever we need another level of abstraction over a group of factories, we can use Abstract Factory Design Pattern.
### Implementation:
* [Example](src/main/java/com/ysingh/creational/abstractfactory/TestApp.java)
### Examples within JDK:
* newInstance() method in javax.xml.parser.DocumentBuilderFactory class
* newInstance() method in javax.xml.transform.TransformerFactory class
* newInstance() method in javax.xml.xpath.XPathFactory class


## Builder Design Pattern
* This pattern is used to create the object systematically when object contains lot of attributes.
* **Problem with Factory/Abstract Factory Design Pattern**:
    * When we have to pass lot of attributes from cliennt program to factory class that can be error prone because most of the times type of parameter is same and from client side it is hard to maintain the order of the parameters.
    * Few parameters might be optional but we in factory design pattern it is mandatory send all the parameters and optional parameters are either to be passed as null or with their default value.
    * If the object is complex and big then all the complexity will be part of factory class.
### Implementation:
* [Example](src/main/java/com/ysingh/creational/builder/TestApp.java)
### Examples within JDK:
* append() method in java.lang.StringBuilder class
* append() method in java.lang.StringBuffer class
* java.util.stream.Stream.Builder

## Prototype Design Pattern
* Prototype design pattern should be used when object creation is costly and requires a lot of time and resources and we have similar object already existing.
* Prototype design pattern provides a way to copy the original object to new object and then modify it accordingly to our needs. Prototype design pattern uses java cloning to copy the objects.
### Implementation:
* [Example](src/main/java/com/ysingh/creational/prototype/TestApp.java)
### Examples within JDK:
* clone() method in java.lang.Object (The class has to implement the java.lang.Cloneable interface)

## Adapter Design Pattern
* Adapter design pattern is one of the structural design pattern.
* It is used to that two unrelated interfaces can work together.
* The object that joins these unrelated interface is called an Adapter.
### Implementation:
* [Example](src/main/java/com/ysingh/structural/adapter/TestApp.java)
### Examples within JDK:
* asList() method in java.util.Arrays
* java.io.InputStreamReader(InputStream)
* java.io.OutputStreamWriter(OutputStream)
* javax.xml.bind.annotation.adapters.XmlAdapter- #marshal() and #unmarshal()

## Composite Design Pattern
* Composite design pattern is one of the structural design pattern.
* It is used when we have to represent a part-out of whole hierarchy.
* When we want to create a structure in a way that the objects in the structure has to be treated the same way then we can apply composite design pattern.
* We can break down the pattern into:
    * **Component** - is the base interface for all the objects in the composition. It should be either an interface or an abstract class with the common methods to manage the child composites.
    * **Leaf** - implements the default behavior of the base component. It doesn't contain a reference to the other objects.
    * **Composite** - It has leaf elements. It implements the base component methods and defines the child-related operations.
    * **Client** - It has access to the composition elements by using the base component object.
### Implementation:
* [Example](src/main/java/com/ysingh/structural/composite/TestApp.java)
### Examples within JDK:
* add(Component) method in java.awt.Container
* getChildren() method in javax.faces.component.UIComponent






