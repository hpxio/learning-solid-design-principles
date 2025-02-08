# Learning SOLID Design Principles in Java

SOLID Design Principles form the foundation for robust, scalable, and maintainable system design. The `SOLID` principles were first introduced by **Robert C. Martin** (also known as _Uncle Bob_) in his 2000 paper "Design Principles and Design Patterns". However, Martin did not name them SOLID at the time – he referred to them simply as **"principles of object-oriented class design"**.   

The SOLID principles are five key design principles every developer should know when building object-oriented applications.

1.	Single Responsibility Principle (`SRP`)
2.	Open-Closed Principle (`OCP`)
3.	Liskov Substitution Principle (`LSP`)
4.	Interface Segregation Principle (`ISP`)
5.	Dependency Inversion Principle (`DIP`)

## Single Responsibility Principle (SRP)

### Definition:
A class should have only one reason to change. This means a class should have one and only one responsibility.

### Detailed Explanation:

1. Key Idea:
   •	Each class should focus on a single functionality or role.
   •	Changes in the software’s requirements should affect only the class responsible for that specific functionality.

2. Real-World Analogy:

> Imagine a printer that performs printing, scanning, and faxing. If something goes wrong with the fax, you wouldn’t want to disrupt the printing functionality. Thus, each feature (printing, scanning, faxing) should ideally be handled by separate components.


#### Why SRP is Important?
* Reduces Complexity: By focusing on one responsibility, code is easier to understand.
* Improves Maintainability: Changes in one area don’t affect unrelated functionality.
* Simplifies Testing: Each class can be independently tested. 
* Promotes Reusability: Single-responsibility classes are often reusable across systems.

#### Common Pitfalls
* Overengineering: Splitting classes unnecessarily can lead to complexity.
* fusion in Responsibility: Avoid assigning unclear or overlapping roles to classes.

### Best Practices
1. Ask the Responsibility Question: “What is the single responsibility of this class?” 
2. Keep Classes Small: Focus on doing one thing well. 
3. Modularize Code: Group related classes for cohesive functionality.