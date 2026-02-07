

1. What is a HashSet?

A HashSet is a collection that:

Stores unique elements only (no duplicates)

Does not maintain insertion order

Is based on a hash table

Allows fast operations (add, remove, search)


📌 In Java, HashSet is part of the Collections Framework and implements the Set interface.


---

2. Why Use HashSet?

Use a HashSet when you want:

No duplicate values

Fast performance

Order does not matter


Example use cases:

Removing duplicates from a list

Checking if an element exists

Storing unique IDs, usernames, emails



---

3. HashSet Hierarchy (Java)

Object
  ↳ Collection
     ↳ Set
        ↳ HashSet


---

4. How HashSet Works Internally

HashSet uses:

Hashing

A backing structure called HashMap


Internal process:

1. When you add an element:

hashCode() is called

The element is placed into a bucket



2. If two objects have the same hash:

equals() is used to check duplicates




📌 Key Rule
If two objects are equal (equals() returns true), they must have the same hashCode().


---

5. Creating a HashSet

Example:

import java.util.HashSet;

HashSet<String> fruits = new HashSet<>();


---

6. Adding Elements

Example:

HashSet<String> fruits = new HashSet<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");
fruits.add("Apple");  // duplicate

Output:

[Apple, Banana, Mango]

🔹 Duplicate "Apple" is ignored automatically.


---

7. Checking Size

System.out.println(fruits.size());

➡️ Output:

3


---

8. Checking if an Element Exists

System.out.println(fruits.contains("Banana"));

➡️ Output:

true


---

9. Removing Elements

fruits.remove("Mango");

After removal:

[Apple, Banana]


---

10. Iterating Through HashSet

Using Enhanced For Loop:

for (String fruit : fruits) {
    System.out.println(fruit);
}

⚠️ Order is not guaranteed.


---

11. Allowing null Values

HashSet allows only one null


HashSet<Integer> numbers = new HashSet<>();

numbers.add(10);
numbers.add(null);
numbers.add(null);

Output:

[null, 10]


---

12. HashSet with Custom Objects

Example:

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

If you add objects without overriding equals() and hashCode(), duplicates may appear.

Correct Way:

@Override
public int hashCode() {
    return id;
}

@Override
public boolean equals(Object obj) {
    Student s = (Student) obj;
    return this.id == s.id;
}


---

13. HashSet vs ArrayList

Feature	HashSet	ArrayList

Duplicates	❌ Not allowed	✅ Allowed
Order	❌ No order	✅ Maintains order
Search speed	⚡ Fast	🐢 Slower
Index access	❌ No	✅ Yes



---

14. Time Complexity

Operation	Complexity

Add	O(1)
Remove	O(1)
Search	O(1)


(Worst case: O(n) when many hash collisions occur)


---

15. Important Points to Remember

✔ No duplicates
✔ No guaranteed order
✔ One null allowed
✔ Fast performance
✔ Uses hashCode() and equals()


---

16. Simple Real-Life Example

Remove duplicates from a list:

int[] nums = {1, 2, 2, 3, 4, 4};

HashSet<Integer> set = new HashSet<>();

for (int n : nums) {
    set.add(n);
}

System.out.println(set);

Output:

[1, 2, 3, 4]
