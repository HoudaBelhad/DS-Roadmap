# Arrays with Java

# 🚀 Java Data Structures Roadmap: Introduction to Arrays

Welcome to the first module of this Data Structures review series! This repository serves as a personal recap of fundamental concepts in Java and a quick reference guide for anyone starting their journey.

## 📝 Concept: What is an Array?

An **Array** is the most basic data structure in Java.

* It is used to store a **fixed-size** sequential collection of elements.
* **Key Rule:** All elements must be of the **same data type** (e.g., all `String`, all `int`).
* Elements are accessed using a **zero-based index** (the first element is at index `0`).

## ⚙️ Implementation in Java (`arrays.java`)

This example demonstrates how to:

1.  **Declare and Allocate** an array by specifying its fixed size.
2.  **Assign** values to each element using its index.
3.  **Iterate** through and print all elements using a standard `for` loop.

### Code Snippet

```java
package Arrays;

public class arrays {
    public static void main(String[] args) {
        // Declares a String array with a fixed size of 3.
        String[] cars = new String[3]; 

        // Assigning values to elements using their zero-based index.
        cars[0] = "BMW";
        cars[1] = "Ford";
        cars[2] = "Toyota";

        // Iterating through the array.
        System.out.println("--- List of Cars ---");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
````

**Next Step:** The next module will cover **2D Arrays** 

