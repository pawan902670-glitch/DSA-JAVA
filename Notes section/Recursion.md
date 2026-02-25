
📘 RECURSION – COMPLETE NOTES (JAVA)


---

1️⃣ What is Recursion?

➤ Definition

Recursion is a technique where a function calls itself to solve a smaller version of the same problem.

➤ Key Idea

> A problem is divided into smaller subproblems of the same type.




---

2️⃣ Why Do We Use Recursion?

We use recursion when:

Problem can be divided into smaller similar problems.

Problem has repetitive structure.

Used in:

Factorial

Fibonacci

Tree traversal

Backtracking

Divide & Conquer

Power calculation




---

3️⃣ Basic Structure of Recursion

Every recursive function has 2 main parts:

1. Base Case   → Stopping condition
2. Recursive Call → Function calling itself

General Form:

returnType functionName(parameters) {

    // Base case
    if(condition)
        return value;

    // Recursive call
    return functionName(smaller_input);
}


---

4️⃣ Example 1: Factorial Using Recursion

🔹 What is Factorial?

n! = n × (n-1) × (n-2) × ... × 1

Example:

5! = 5 × 4 × 3 × 2 × 1 = 120


---

🔹 Code

public class FactorialExample {

    public static int factorial(int n) {

        // Base case
        if (n == 0 || n == 1)
            return 1;

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}


---

🔹 How It Works (Step by Step)

Calling:

factorial(5)

It becomes:

5 * factorial(4)
5 * 4 * factorial(3)
5 * 4 * 3 * factorial(2)
5 * 4 * 3 * 2 * factorial(1)

Since factorial(1) = 1 (Base Case)

Now returning back:

5 × 4 × 3 × 2 × 1 = 120


---

🔹 Time Complexity

O(n)

Because function is called n times.

🔹 Space Complexity

O(n)

Because of function call stack.


---

5️⃣ Example 2: Print Numbers from 1 to N

🔹 Code

public class PrintNumbers {

    public static void print(int n) {

        // Base case
        if (n == 0)
            return;

        print(n - 1);     // Recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print(5);
    }
}

Output:

1 2 3 4 5


---

🔹 How It Works

Calls stack builds:

print(5)
print(4)
print(3)
print(2)
print(1)
print(0)

Then prints during returning phase.


---

6️⃣ Power Function (a^b)


---

Method 1️⃣: Normal Recursive Method

Formula:

a^b = a × a^(b-1)


---

🔹 Code

public class PowerExample {

    public static int power(int a, int b) {

        // Base case
        if (b == 0)
            return 1;

        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}


---

🔹 Time Complexity

O(b)

🔹 Space Complexity

O(b)


---

7️⃣ Optimized Power (Divide & Conquer)

This is the important part from your notes.


---

🔹 Idea

Instead of reducing exponent by 1:

We divide it by 2.

Formula:

If b is even:

a^b = (a^(b/2)) × (a^(b/2))

If b is odd:

a^b = a × (a^(b/2)) × (a^(b/2))


---

🔹 Code (Optimized Version)

public class OptimizedPower {

    public static int power(int a, int b) {

        // Base case
        if (b == 0)
            return 1;

        int call = power(a, b / 2);

        if (b % 2 == 0)
            return call * call;
        else
            return a * call * call;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}


---

🔹 How It Works

Example:

power(2, 10)

Calls:

power(2, 5)
power(2, 2)
power(2, 1)
power(2, 0)

Then returns back.

Instead of 10 calls, we only make:

log₂(10) ≈ 4 calls


---

🔹 Time Complexity

O(log b)

Much faster than O(b).

🔹 Space Complexity

O(log b)


---

8️⃣ Time Complexity in Recursion

Depends on:

1. Number of recursive calls


2. Work done in each call



General Rule:

Total Time = (Number of Calls) × (Work per Call)


---

9️⃣ Space Complexity in Recursion

Depends on:

Maximum depth of recursive stack


Each recursive call uses memory in stack.


---

🔟 Important Points to Remember

✔ Always define a Base Case
✔ Recursive call must reduce problem size
✔ Avoid infinite recursion
✔ Stack overflow occurs if no base case


---

1️⃣1️⃣ Difference: Normal vs Optimized Power

Method	Time	Space	Speed

Normal recursion	O(b)	O(b)	Slower
Optimized recursion	O(log b)	O(log b)	Faster



---

📌 Final Understanding

Recursion works in:

1. Going down phase → Function calls stack build


2. Returning phase → Answers calculated

