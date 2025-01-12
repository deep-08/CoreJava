Core Java Concepts

Overview

Core Java refers to the fundamental components of the Java programming language. It provides the base for developing general-purpose Java applications and serves as the foundation for advanced Java frameworks and tools. This document outlines the key concepts and features of Core Java.

Table of Contents

Introduction to Java

Basic Syntax

Object-Oriented Programming (OOP)

Exception Handling

Multithreading

Collections Framework

Input/Output (I/O)

Java APIs

Best Practices

1. Introduction to Java

Platform Independence: Java uses the "Write Once, Run Anywhere" (WORA) principle.

JVM, JRE, and JDK:

JVM (Java Virtual Machine): Executes Java bytecode.

JRE (Java Runtime Environment): Provides libraries and JVM.

JDK (Java Development Kit): Includes tools for developing Java programs.

Key Features:

Simple, secure, and portable.

Object-oriented and robust.

Supports multithreading and high performance.

2. Basic Syntax

Hello World Example:

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

Data Types:

Primitive: int, float, char, boolean, etc.

Non-Primitive: String, Arrays, Objects, etc.

Control Structures:

Loops: for, while, do-while

Conditional: if, else, switch

3. Object-Oriented Programming (OOP)



Key Principles

Encapsulation: Wrapping data (variables) and code (methods) together.

Inheritance: Acquiring properties of one class into another.

Polymorphism: Performing a single action in different ways (method overloading and overriding).

Abstraction: Hiding implementation details from the user.

Example:

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}

4. Exception Handling



Definition: Mechanism to handle runtime errors, ensuring normal flow of application.

Keywords:

try, catch, finally, throw, throws

Example:

try {
    int data = 50 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero: " + e);
} finally {
    System.out.println("Finally block executed");
}

5. Multithreading

Definition: Process of executing multiple threads simultaneously.

Thread Creation:

By extending Thread class.

By implementing Runnable interface.

Example:

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

6. Collections Framework



Definition: A set of classes and interfaces for working with groups of objects.

Key Interfaces:

List, Set, Map, Queue

Common Classes:

ArrayList, HashSet, HashMap, LinkedList

Example:

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        System.out.println(list);
    }
}

7. Input/Output (I/O)

Definition: Reading and writing data to/from files, console, etc.

Classes:

FileReader, FileWriter, BufferedReader, Scanner

Example:

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

8. Java APIs

Key Packages:

java.lang: Core classes like String, Math, Object

java.util: Utilities like Collections, Date

java.io: Input/Output classes

java.net: Networking classes

java.sql: Database connectivity

9. Best Practices

Follow naming conventions (e.g., camelCase for variables).

Use proper access modifiers (private, public, protected).

Avoid hardcoding values; use constants.

Close resources like file streams and database connections.

Write modular and reusable code.

Handle exceptions effectively.

Use logging frameworks for better debugging.

Code Format Example with Add Link Icon

Below is an example code snippet demonstrating how to use FontAwesome icons for adding a link icon in your Java GUI applications.

import javax.swing.*;

public class AddLinkIconExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Add Link Icon Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a button with a link icon
        JButton button = new JButton("Click Here");
        button.setIcon(new ImageIcon("path/to/link-icon.png")); // Replace with actual path to your icon

        // Add action listener
        button.addActionListener(e -> {
            System.out.println("Link clicked!");
        });

        // Add button to the frame
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}

Conclusion

Mastering Core Java is essential for any Java developer. It lays the groundwork for advanced programming and framework development. By understanding the concepts outlined in this document, you can build robust and efficient Java applications.

For further study, refer to the official Java documentation.
