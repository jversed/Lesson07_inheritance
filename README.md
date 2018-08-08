# Lesson07_inheritance

Inheritance in Java
-----------------------

Inheritance is an important pillar of OOP(Object Oriented Programming).
It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.
Important terminology:

Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).

Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class). 
The subclass can add its own fields and methods in addition to the superclass fields and methods.

Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a 
class that includes some of the code that we want, we can derive our new classfrom the existing class. 
By doing this, we are reusing the fields and methods of the existing class.

----------------------------------------------------------------------------------------------------------------------------------
Types of Inheritance in Java:
1. Single Inheritance : In single inheritance, subclasses inherit the features of one superclass. 
In image below, the class A serves as a base class for the derived class B.

![alt text](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/inheritance1.png)

2. Multilevel Inheritance : In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived 
class also act as the base class to other class. In below image, the class A serves as a base class for the derived class B, 
which in turn serves as a base class for the derived class C. In Java, a class cannot directly access the grandparent’s members.

![alt text](https://contribute.geeksforgeeks.org/wp-content/uploads/inheritance3.png)

3. Hierarchical Inheritance : In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one sub class.
In below image, the class A serves as a base class for the derived class B,C and D.

![alt text](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/inheritance4.png)

4. Multiple Inheritance (Through Interfaces) : In Multiple inheritance ,one class can have more than one superclass and inherit 
features from all parent classes. Please note that Java does not support multiple inheritance with classes. 
In java, we can achieve multiple inheritance only through Interfaces. In image below, Class C is derived from interface A and B.

![alt text](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/inheritance2-1.png)

5. Hybrid Inheritance(Through Interfaces) : It is a mix of two or more of the above types of inheritance. 
Since java doesn’t support multiple inheritance with classes, the hybrid inheritance is also not possible with classes. 
In java, we can achieve hybrid inheritance only through Interfaces.

![alt text](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/inheritance-1.png)

--------------------------------------------------------------------------------------------------------------------------------------
Important facts about inheritance in Java

► Default superclass: Except Object class, which has no superclass, every class has one and only one direct superclass 
(single inheritance). In the absence of any other explicit superclass, every class is implicitly a subclass of Object class.

► Superclass can only be one: A superclass can have any number of subclasses. But a subclass can have only one superclass.
This is because Java does not support multiple inheritance with classes. 
Although with interfaces, multiple inheritance is supported by java.

► Inheriting Constructors: A subclass inherits all the members (fields, methods, and nested classes) from its superclass. 
Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the 
subclass.

► Private member inheritance: A subclass does not inherit the private members of its parent class. However, if the superclass has 
public or protected methods(like getters and setters) for accessing its private fields, these can also be used by the subclass.
