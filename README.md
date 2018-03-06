# Design-Patterns


## DESIGN PRINCIPLES

### Strategy Pattern

**1. Identify the aspects of your application that vary and seprate them from what stays the same.**

Removing quack() and fly() methods from Duck class, because these are customizable

**2. Program to inerface, not an implementation**

Creating interfaces of DuckBehaviour and QuackBehaviour.

**3. Favor composition over inheritance**

Using DuckBehaviour and QuackBehaviour fields in Duck class rather than classifying them in sub classes of Duck.
