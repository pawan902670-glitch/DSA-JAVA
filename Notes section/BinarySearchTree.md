 Types of Binary Tree – Notes

## 1. Binary Tree

A **binary tree** is a tree data structure in which each node has **at most two children**, called the **left child** and **right child**.

```
      A
     / \
    B   C
   / \
  D   E
```

---

# 2. Full Binary Tree (Strict/Proper Binary Tree)

A binary tree where **every node has either 0 or 2 children**.

### Example

```
       A
      / \
     B   C
    / \
   D   E
```

✅ Every node has either **2 children or no child**.

### Properties

* No node has exactly one child.
* Leaf nodes have 0 children.

---

# 3. Complete Binary Tree

A binary tree where:

* All levels are completely filled except possibly the last.
* The last level is filled **from left to right**.

### Example

```
        A
      /   \
     B     C
    / \   /
   D   E F
```

✅ Last level is filled from left.

### Applications

* Heap
* Priority Queue

---

# 4. Perfect Binary Tree

A binary tree where:

* Every internal node has exactly **2 children**.
* All leaf nodes are at the **same level**.

### Example

```
        A
      /   \
     B     C
    / \   / \
   D  E  F  G
```

### Formula

If height = **h**

* Total Nodes = **2^(h+1) − 1**
* Leaf Nodes = **2^h**

---

# 5. Balanced Binary Tree

A binary tree where the height difference between left and right subtrees of every node is **at most 1**.

### Example

```
      A
     / \
    B   C
   /
  D
```

✅ Balanced

### Not Balanced

```
A
 \
  B
   \
    C
     \
      D
```

### Advantages

* Fast searching
* Time Complexity:

  * Search → **O(log n)**
  * Insert → **O(log n)**
  * Delete → **O(log n)**

### Examples

* AVL Tree
* Red-Black Tree

---

# 6. Degenerate Binary Tree (Skewed Tree)

A tree where every node has only **one child**.

### Left Skewed

```
    A
   /
  B
 /
C
/
D
```

### Right Skewed

```
A
 \
  B
   \
    C
     \
      D
```

### Complexity

* Search = **O(n)**
* Insert = **O(n)**

---

# 7. Left Skewed Binary Tree

Every node has only a **left child**.

```
    A
   /
  B
 /
C
/
D
```

---

# 8. Right Skewed Binary Tree

Every node has only a **right child**.

```
A
 \
  B
   \
    C
     \
      D
```

---

# 9. Threaded Binary Tree

A binary tree where **NULL pointers are replaced with links** to the inorder predecessor or successor.

### Advantages

* Faster inorder traversal
* No recursion or stack required

### Types

* Single Threaded
* Double Threaded

---

# Comparison Table

| Type                   | Condition                       | Example Feature     |
| ---------------------- | ------------------------------- | ------------------- |
| Full Binary Tree       | Every node has 0 or 2 children  | No single child     |
| Complete Binary Tree   | Last level filled from left     | Used in Heap        |
| Perfect Binary Tree    | Full + all leaves at same level | Maximum nodes       |
| Balanced Binary Tree   | Height difference ≤ 1           | Fast operations     |
| Degenerate Binary Tree | Every node has one child        | Like a linked list  |
| Left Skewed Tree       | Only left children              | Linear structure    |
| Right Skewed Tree      | Only right children             | Linear structure    |
| Threaded Binary Tree   | Uses NULL pointers as threads   | Efficient traversal |

---

# Important Formulas

For a **Perfect Binary Tree**:

* Height = **h**
* Total Nodes = **2^(h+1) − 1**
* Leaf Nodes = **2^h**
* Internal Nodes = **2^h − 1**

General binary tree facts:

* Maximum nodes at level **i** = **2^i**
* Maximum nodes in a binary tree of height **h** = **2^(h+1) − 1**
* Minimum height for **n** nodes = **⌈log₂(n + 1)⌉ − 1**

---

# Exam Tips

* **Full** → Every node has **0 or 2 children**.
* **Complete** → Last level is filled **left to right**.
* **Perfect** → Full tree + all leaves are at the same level.
* **Balanced** → Height difference at every node is **≤ 1**.
* **Degenerate/Skewed** → Every node has only **one child** (resembles a linked list).
