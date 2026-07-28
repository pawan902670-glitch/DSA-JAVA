DATA STRUCTURE – TREE (Complete Notes)

1. What is a Tree?

Definition

A Tree is a non-linear data structure used to store data in a hierarchical (parent-child) form.

Why do we use Trees?

Stores data in hierarchical format.

Easy searching and sorting.

Fast insertion and deletion.

Used in databases, file systems, XML, HTML DOM, etc.



---

Real-Life Example

Company

        CEO
      /     \
   Manager1 Manager2
   /   \        \
 Emp1 Emp2     Emp3

Another example:

Folder
│
├── Documents
│   ├── Resume.pdf
│   └── Notes.docx
│
├── Pictures
│   ├── Photo1.jpg
│   └── Photo2.jpg
│
└── Videos


---

Basic Terminology of Tree

Example Tree

A
          /  |  \
         B   C   D
        / \      \
       E   F      G

1. Root Node

The topmost node.

Example: A


---

2. Parent Node

A node having child nodes.

Example

A → Parent of B,C,D

B → Parent of E,F


---

3. Child Node

Nodes connected below a parent.

Example

Children of A = B,C,D

Children of B = E,F


---

4. Leaf Node (External Node)

Nodes having no children.

Example

Leaf Nodes

E
F
C
G


---

5. Internal Node

Nodes having at least one child.

Example

A
B
D


---

6. Edge

Connection between two nodes.

Example

A ----- B

One edge


---

7. Degree of Node

Number of children of a node.

Example

Degree(A)=3

Degree(B)=2

Degree(C)=0


---

8. Degree of Tree

Maximum degree among all nodes.

Example

Degree(Tree)=3

because A has 3 children.


---

9. Level

Level starts from 0.

A        Level 0

         B  C  D      Level 1

        E F    G      Level 2


---

10. Height of Tree

Number of edges from root to deepest leaf.

A → D → G

Height = 2


---

11. Depth

Distance from root to a node.

Example

Depth(A)=0

Depth(B)=1

Depth(E)=2


---

Binary Tree

Definition

A Binary Tree is a tree in which every node has at most two children.

Children are:

Left Child

Right Child


Example

10
         /  \
        5   20
       / \    \
      3   8   25


---

Properties

Maximum children = 2

Left child

Right child



---

Types of Binary Tree

1. Full Binary Tree

Every node has either

0 child

2 children


Example

A
      /   \
     B     C
    / \   / \
   D  E  F  G


---

2. Complete Binary Tree

All levels are completely filled except possibly the last level.

Last level is filled from left to right.

Example

A
      /   \
     B     C
    / \   /
   D  E  F


---

3. Perfect Binary Tree

All internal nodes have two children and all leaves are at the same level.

Example

A
      /   \
     B     C
    / \   / \
   D  E  F  G


---

4. Skewed Binary Tree

Every node has only one child.

Left Skewed

A
|
B
|
C
|
D

Right Skewed

A
 \
  B
   \
    C
     \
      D


---

Tree Traversal

Traversal means visiting every node exactly once.

Example

A
       /   \
      B     C
     / \   / \
    D  E  F  G


---

1. Preorder Traversal

Order

Root → Left → Right

Example

A B D E C F G


---

2. Inorder Traversal

Order

Left → Root → Right

Example

D B E A F C G


---

3. Postorder Traversal

Order

Left → Right → Root

Example

D E B F G C A


---

4. Level Order Traversal

Visit level by level.

Example

A B C D E F G


---

Advantages of Tree

Fast searching

Hierarchical storage

Easy insertion and deletion

Better organization of data

Used in databases and operating systems



---

Applications

File System

Database Indexing

XML/HTML DOM

Compiler

Artificial Intelligence

Decision Tree

Routing Algorithms



---

Viva / Exam Questions

1. What is a Tree?


2. Define Root Node.


3. What is a Leaf Node?


4. Difference between Parent and Child Node.


5. What is Degree of a Tree?


6. What is Height of a Tree?


7. What is Depth of a Node?


8. Define Binary Tree.


9. Difference between Full and Complete Binary Tree.


10. Explain Preorder, Inorder, Postorder, and Level Order Traversal with examples.


