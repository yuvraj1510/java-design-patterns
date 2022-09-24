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
    * [Bridge Pattern](src/main/java/com/ysingh/structural/bridge)
    * [Decorator Pattern](src/main/java/com/ysingh/structural/decorator)
    * [Facade Pattern](src/main/java/com/ysingh/structural/facade)
    * [Composite Pattern](src/main/java/com/ysingh/structural/composite)
    * [Proxy Pattern](src/main/java/com/ysingh/structural/proxy)
    * Flyweight Pattern

Name|Used Notion(Inheritance or Composition)|Example Used
----|---------------------------------------|------------
Adapter | Inheritance for Adapter implementations and composition for joining those implementations | Mobile Adapter - convert 240 Volts to 3 Volts
Bridge | Abstract class in composition with Interface and implementation of Abstract class and Interfaces | Draw Shape and Fill Color - Shape is Abstract class and Color is interface
Decorator | Inhertance for Base implementation and then composition of enhanced implementation using Base implementation | Bike - Basic Bike, and Luxury and Sport Bike created using Decorator
Facade | Composition of different interfaces and give simple facade to call the methods of composed interfaces | Report - PdfReport, HtmlReport, ExcelReport
Composite | Uses inheritance with different implementation and then single implementation of same interface combined different implementation | Service - Employee and Admin Service based on ServiceType
Proxy | Inheritance for main implementation and then composition for main implementation in Proxy implementation | Very expensive process implementation and Very expensive process proxy


* **Behavioral Design Pattern:** This provides solution for the better interaction between objects and how to provide loose coupling and flexibility to extend easily. This is mainly about communication between the classes in loose coupled manner.
    * [Chain of Responsibility Pattern](src/main/java/com/ysingh/behavioral/cor)
    * [Template Method Pattern](src/main/java/com/ysingh/behavioral/template)
    * [Observer Pattern](src/main/java/com/ysingh/behavioral/observer)
    * [Strategy Pattern](src/main/java/com/ysingh/behavioral/strategy)
    * [Mediator Pattern](src/main/java/com/ysingh/behavioral/mediator)
    * Command Pattern
    * [State Pattern](src/main/java/com/ysingh/behavioral/state)
    * [Visitor Pattern](src/main/java/com/ysingh/behavioral/visitor)
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
    * When we have to pass lot of attributes from client program to factory class that can be error prone because most of the times type of parameter is same and from client side it is hard to maintain the order of the parameters.
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

## Proxy Design Pattern
* The Proxy pattern allows us to create an intermediary that acts as an interface to an another resource and also hiding the underlying complexity of the component.
* Proxy means "in place of" representing or "on behalf of" are literal meanings of proxy and that directly explains Proxy Design Patterns.
* Consider heavy java objects (like a JDBC connection or a SessionFactory) that require some initial configuration. We only want such objects to be initialized on demand, and once they are, we'd want to reuse them for all calls.
* We should use this when we want a simplified version of a complex or heavy object.
### Implementation:
* [Example](src/main/java/com/ysingh/structural/proxy/TestApp.java)
### Examples within JDK:
* java.lang.reflect.Proxy
* java.rmi.*
* javax.ejb.EJB
* javax.persistence.PersistenceContext

## Facade Design Pattern
* Facade design pattern is one of the structural design pattern.
* Facade design pattern is used to help client applications to easily interact with the system.
* This pattern provides a unified interface to a set of interfaces in a subsystem or system. Facade pattern defines a higher-level interface that makes the subsystem easier to use.
* Facade Design Pattern doesn't hide the sub system interfaces from client. Whether to use Facade or not is completely dependent on client code.
* Facade design pattern can be applied at any point of development, usually when the number of interfaces grow and system gets complex.
* Facade pattern should be applied to similar kind of interfaces.
### Implementation:
* [Example](src/main/java/com/ysingh/structural/facade/TestApp.java)
### Examples within JDK:
* javax.faces.context.FacesContext
* javax.faces.context.ExternalContext

## Decorator Design Pattern
* Decorator design pattern is one of the structural design pattern.
* Decorator design pattern is used to modify the functionality of an object at runtime. At the same time other instances of the same class will not be affected by this. so individual object gets the modified behavior.
* This Pattern provides a wrapper to the existing class.
* Decorator design pattern uses abstracts or interfaces with the composition to implement the wrapper.
* Decorator design pattern is helpful in providing runtime modification abilities and hence more flexible. Its easy to maintain and extend when the number of choices are more.
### Implementation:
* [Example](src/main/java/com/ysingh/structural/decorator/TestApp.java)
### Examples within JDK:
* Used a lot in Java IO packages, such as FileReader, BufferedReader, BufferedInputStream etc.
* java.utils.Collections (synchronizedTTT() and unmodifiableTTT() methods)
* javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper.

## Bridge Design Pattern
* Bridge design pattern is one of the structural design pattern.
* When we have interface hierarchies in both interfaces as well as implementation then bridge design pattern is used to decouple the interfaces from implementation and hiding the implementation details from the client.
* This decouple abstraction from its implementation so that he two can vary independently.
* The implementation of bridge design pattern follows the notion to refer Composition over inheritance.
* Bridge Design Pattern can be used when both abstraction and implementation can have different hierarchies independently and we want to hide the implementation from the client application.
### Implementation:
* [Example](src/main/java/com/ysingh/structural/bridge/TestApp.java)

## Template Design Pattern
* Template design pattern is one of the behavioral design pattern.
* It used to create a method stub and that differs some of the steps of implementation to the subclasses.
* Template method defines the steps to execute an algorithm and it can provide default implementation that might be common for all or some of the classes.
* Template method should consists of certain steps whose order is fixed and for some of the methods, implementation differs from base class to sub class. If we want some of method should not be overriden by sub classes then we need those template methods as final.
* **Use Case** - Making of a Pizza
    * selecting bread
    * adding ingredients
    * cooking
    * adding toopings
    * adding cheese
### Implementation:
* [Example](src/main/java/com/ysingh/behavioral/template/TestApp.java)
### Examples within JDK:
* All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.
* All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.
* In Spring framework we have several classes which uses Method Template design pattern - JdbcTemplate, HibernateTemplate, JmsTemplate, RestTemplate, SimpleJdbcTemplate,TransactionTemplate.

## Mediator Design Pattern
* Mediator design pattern is one of the behavioral design pattern.
* It deals with the behaviors of objects. It is used to provide a centrazied communication medium between different objects in a system.
* The system objects that communicate each other are called Collegues. Usually we have an interface or abstract class that provides the contract for communication and then we have concrete implementation of mediators.
* Mediator pattern is useful when the communication logic between objects is complex, we have a central point of communication that takes care of communication logic.
### Implementation:
* [Example](src/main/java/com/ysingh/behavioral/mediator/TestApp.java)
### Examples within JDK:
* scheduleTTT() methods in java.util.Time class
* execute() method in Java Concurrency Executor.
* invoke() method in java.lang.reflect.Method.

## Chain of Responsibility (COR) Design Pattern
* COR design pattern is one of the behavioral design pattern.
* COR is used to achieve loose couping in software design where a request from client is passed to a chain of objects to process them. Then the object in chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.
### Important Points
* Client doesn't know which part of the chain will be processing the request and it will send the request to the first object in the chain.
* Each object in the chain will have it's own implementation to process the request, either full or partial or to send it to the next object in the chain.
* Every object in the chain should have reference to the next object in chain to forward the request to, it is achieved by java composition.
* Creating the chain carefully is very important otherwise there might be a case that the request will never be forwarded to a particular processor or there are no objects in the chain who are able to handle the request.
### Implementation:
* [Example](src/main/java/com/ysingh/behavioral/cor/TestApp.java)
### Examples within JDK:
* Exception handling chain based on exception thrown.
* log() method in java.util.logging.Logger.
* doFilter() method in javax.servlet.Filter.

## Strategy Design Pattern
* Strategy design pattern is one of the behavioral design pattern.
* Strategy design pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
* It is also known as Policy Pattern. We define multiple algorithm and let client application pass the algorithm to be used as parameter.
* One of the best example of strategy pattern is Collections.sort(...) method that takes Comparator parameter. Based on different implementations of Comparator interface the Objects are getting sorted in different ways.
### Implementation:
* [Example](src/main/java/com/ysingh/behavioral/strategy/TestApp.java)
### Examples within JDK:
* sort() method in Collections.
* service() method in javax.servlet.http.HttpServlet plus all of the doTTT() methods that access HttpServletRequest and HttpServletResponse objects as arguments.

## State Design Pattern
* State design pattern is one of the behavioral design pattern.
* It is used when an Object change its behavior based on its internal state.
* The benefit of using State pattern to implement polymorphic behavior. The chances of error are less and it's very easy to add more states for additional behavior. Thus making our code more robust, easily maintainable and flexible.
### Implementation:
* [Example](src/main/java/com/ysingh/behavioral/state/TestApp.java)

## Visitor Design Pattern
* Visitor design pattern is one of the behavioral design pattern.
* It is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class.
* The benefit of this pattern is that if the logic of operation changes, then we need to make change only in the visitor implementation rather than doing it in all the class.
* Another benefit is that adding a new class to the system is easy, it will require change only in visitor interface and implementation and existing classes will not be affected.
### Implementation:
* [Example](src/main/java/com/ysingh/behavioral/visitor/TestApp.java)
### Examples within JDK:
* javax.lang.model.element.AnnotationValue and AnnotationValueVisitor
* javax.lang.model.element.Element and ElementVisitor
* javax.lang.model.type.TypeMirror and TypeVisitor
* java.nio.file.FileVisitor and SimpleFileVisitor

## Observer Design Pattern
* Observer design pattern is one of the behavioral design pattern.
* This is useful when we are interested in the state of an object and want to get notified whenever there is any change.
* The object that watch on the state of another object are called Observer and the object that is being watched is called Subject.
* In this Pattern, we define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
* Subject contains a list of observers to notify of any change in it's state, so it should provide method using which observers can register and unregister themselves. Subject also contain a method to notify all the observers of any change and either it can send the update while notifying the observer or it can provide another method to get the update.
### Implementation:
* [Example](src/main/java/com/ysingh/behavioral/observer/TestApp.java)
### Examples within JDK:
* java.util.Observer & java.util.Observable
* javax.servlet.http.HttpSessionBindingListerner
* javax.servlet.http.HttpSessionAttibuteListerner