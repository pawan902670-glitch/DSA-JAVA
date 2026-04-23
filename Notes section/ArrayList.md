

📘 ARRAYLIST – DETAILED NOTES

1. Introduction

An ArrayList is a part of the Java Collections Framework and is used to store dynamic data.

👉 It is implemented using a resizable array internally.

🔑 Key Idea:

Array → fixed size

ArrayList → automatically resizes when needed



---

2. Internal Working (Very Important)

🔍 How ArrayList works internally:

Internally uses an array

Default capacity = 10

When full → creates a new array (1.5× size)


Example:

Initial capacity = 10
After full → 15
Then → 22
Then → 33 ...

⚙️ Steps:

1. Create array of size 10


2. Add elements


3. If full:

Create new bigger array

Copy old elements

Add new element




👉 This process is called dynamic resizing


---

3. Syntax & Declaration

import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();

Variations:

ArrayList<String> names = new ArrayList<>();
ArrayList<Double> marks = new ArrayList<>();

👉 Works only with objects, not primitive types
(Use wrapper classes: Integer, Double, etc.)


---

4. Important Methods (Core Operations)


---

(1) add() – Insert Element

list.add(10);
list.add(20);

📌 Output:

[10, 20]

👉 Insert at specific index:

list.add(1, 50);


---

(2) get() – Access Element

list.get(0);

👉 Returns element at index 0


---

(3) set() – Update Element

list.set(1, 100);

📌 Replaces value at index 1


---

(4) remove() – Delete Element

list.remove(1);     // remove by index
list.remove(Integer.valueOf(10)); // remove by value


---

(5) size() – Get Length

list.size();


---

(6) contains()

list.contains(20);

👉 Returns true/false


---

(7) clear()

list.clear();

👉 Removes all elements


---

5. Example (Step-by-Step)

ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

System.out.println(list);

📌 Output:

[10, 20, 30]

Modify:

list.set(1, 50);

📌 Output:

[10, 50, 30]

Remove:

list.remove(0);

📌 Output:

[50, 30]


---

6. Traversing ArrayList

(A) Using for loop

for(int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}


---

(B) Enhanced for loop

for(int num : list) {
    System.out.println(num);
}


---

(C) Iterator

Iterator<Integer> it = list.iterator();
while(it.hasNext()) {
    System.out.println(it.next());
}


---

7. Time Complexity (Very Important)

Operation	Time Complexity

Add (end)	O(1)
Add (middle)	O(n)
Remove	O(n)
Get	O(1)
Search	O(n)


👉 Why remove is O(n)?
Because elements shift after deletion.


---

8. Advantages

✔ Dynamic size
✔ Easy to use
✔ Built-in methods
✔ Fast random access (index-based)


---

9. Disadvantages

❌ Slower insertion/deletion (shifting needed)
❌ More memory usage
❌ Not synchronized (not thread-safe)


---

10. Array vs ArrayList

Feature	Array	ArrayList

Size	Fixed	Dynamic
Type	Primitive + Object	Only Objects
Methods	No	Many
Performance	Faster	Slightly slower



---

11. Real-Life Example

📚 Library Book System

ArrayList<String> books = new ArrayList<>();

books.add("Math");
books.add("Science");
books.add("English");

👉 If a new book arrives:

books.add("Computer");

👉 If a book is removed:

books.remove("Science");

📌 Final list:

[Math, English, Computer]


---

12. Capacity vs Size

Size → number of elements

Capacity → internal array size


ArrayList<Integer> list = new ArrayList<>(50);

👉 Initial capacity = 50


---

13. Common Mistakes

❌ Using primitive types:

ArrayList<int> list; // WRONG

✔ Correct:

ArrayList<Integer> list;


---

14. When to Use ArrayList?

✔ Frequent searching
✔ Random access needed
✔ Dynamic data storage


---

15. Interview Questions

1. Difference between Array and ArrayList


2. How resizing works internally?


3. Why ArrayList is not thread-safe?


4. Difference between ArrayList and LinkedList


5. What is capacity vs size?




---

✅ Final Summary

ArrayList = Dynamic array

Backed by array internally

Fast access, slower modification

Widely used in Java programming


