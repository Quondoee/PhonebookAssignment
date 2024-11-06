# Java Collections Overview

## Introduction
This repository provides an overview of Java Collections, a framework that provides architecture to store and manipulate a group of objects. The Java Collections Framework (JCF) is part of the Java Standard Library and offers various data structures and algorithms to work with collections.

## Key Interfaces
- **Collection**: The root interface in the collection hierarchy. It represents a group of objects known as elements.
- **List**: An ordered collection (also known as a sequence) that can contain duplicate elements. Examples include `ArrayList`, `LinkedList`, and `Vector`.
- **Set**: A collection that does not allow duplicate elements. Examples include `HashSet`, `LinkedHashSet`, and `TreeSet`.
- **Map**: An object that maps keys to values, where each key is unique. Examples include `HashMap`, `LinkedHashMap`, and `TreeMap`.

## Common Implementations
- **ArrayList**: Resizable array implementation of the `List` interface. It allows random access and is efficient for adding elements.
- **LinkedList**: Doubly-linked list implementation of the `List` interface. It is efficient for insertions and deletions.
- **HashSet**: Implementation of the `Set` interface using a hash table. It allows constant-time performance for basic operations (add, remove, contains).
- **TreeSet**: A `Set` that uses a red-black tree to store elements in a sorted order.
- **HashMap**: A hash table-based implementation of the `Map` interface. It allows for efficient key-value pair storage.
- **TreeMap**: A `Map` that maintains its entries in ascending order of keys.

## Benefits of Using Collections
- **Ease of Use**: Collections provide a simple way to manage groups of objects.
- **Flexibility**: Different implementations can be chosen based on performance needs (e.g., quick access vs. sorted order).
- **Rich API**: The Collections Framework includes various utilities and algorithms (sorting, searching, etc.) that make data manipulation easier.

## Example
Here’s a quick example demonstrating the use of an `ArrayList`:

```java
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
