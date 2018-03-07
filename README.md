# Design Patterns

## *Strategy Pattern*

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

**1. Identify the aspects of your application that vary and seprate them from what stays the same.**

Removing quack() and fly() methods from Duck class, because these are customizable

**2. Program to inerface, not an implementation**

Creating interfaces of DuckBehaviour and QuackBehaviour.

**3. Favor composition over inheritance**

Using DuckBehaviour and QuackBehaviour fields in Duck class rather than classifying them in sub classes of Duck.

## *Observer Pattern*

Publisher + Subscriber = Observer Pattern

where publisher is the subject and subscriber is the observer.

The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

The Observer Pattern defines a one-to-many relationship between a set of objects.

When the state of one object changes, all of its dependents are notified.

**4. Strive for loosely coupled designs between objects that interact.**

Steps: 

1. create two interfaces - subject and observer
Implementation of subjects should have all methods necessary for publisher. i.e, notifyObserver, registerObserver and removeObserver
2. subjects should have - registerObserver(), removeObserver() and notifyObserver()
Implementation of observer must have a method to receive updated.
3. observer should have - update() method to receive update
implement these interfaces,
4. Keep track of all observers in subject.
5. in notifyObserver implementation method of subject, iterate through all observers and update their values. 
