# Java Collections Exercises

This repository contains a series of exercises designed to practice and deepen your understanding of **Java Collections**. Below are the details of each exercise, grouped by level.

---

## **Level 1**

### **Exercise 1: Month Management**
- Create a `Month` class with an attribute `name` that stores the name of a month.
- Add 11 `Month` objects (each with a unique name) to an `ArrayList`, excluding the one with the attribute "August".
- Insert the "August" object in its correct position and ensure the `ArrayList` maintains the correct order.
- Convert the `ArrayList` into a `HashSet` and ensure it prevents duplicates.
- Iterate through the list using both a `for` loop and an `Iterator`.

---

### **Exercise 2: Reversed List**
- Create and populate a `List<Integer>`.
- Create a second `List<Integer>` and insert the elements of the first list in reverse order.
- Use `ListIterator` objects to read elements from the first list and insert them into the second list.

---

### **Exercise 3: Countries and Capitals Game**
- Read the file `countries.txt`, which contains country-capital pairs, and store the data in a `HashMap<String, String>`.
- Prompt the user for their name and randomly select a country from the `HashMap`.
- The user must input the capital of the given country. Award one point for each correct answer.
- Repeat this process 10 times.
- After 10 rounds, save the user's name and score in a file named `classification.txt`.

---

## **Level 2**

### **Exercise 1: Unique Restaurants**
- Create a `Restaurant` class with two attributes: `name` (`String`) and `rating` (`int`).
- Implement the necessary methods to ensure that a `HashSet` cannot contain `Restaurant` objects with the same name and rating.
- Note: Restaurants can have the same name with different ratings, but not the same name and rating simultaneously.

---

### **Exercise 2: Ordered Restaurants**
- Extend the previous `Restaurant` implementation to allow sorting of `Restaurant` objects.
- Sort by `name` and then by `rating` in descending order.

**Example:**
Name: restaurant1, Rating: 8 Name: restaurant1, Rating: 7


---

This repository is designed to strengthen your understanding of Java Collections and their practical applications in real-world scenarios. Let me know if you'd like to enhance or format this further!
