
---

📘 1. Recursion in Java

✅ What is Recursion?

Recursion is when a method calls itself to solve a smaller part of the problem.


---

🔑 Structure of Recursion

returnType functionName(parameters) {
    // Base case (stopping condition)
    if (condition) {
        return value;
    }

    // Recursive case
    return functionName(smallerInput);
}


---

🧠 Example: Factorial

public class Main {
    public static int factorial(int n) {
        if (n == 0) {   // base case
            return 1;
        }
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}


---

⚠️ Important Points

Always define a base case

Reduce input size each call

Avoid infinite recursion



---

📘 2. Recursion Thinking

👉 Think like this:

1. Solve smaller problem


2. Trust recursion


3. Combine results




---

🧩 Example: Fibonacci

public static int fib(int n) {
    if (n <= 1) {
        return n;
    }
    return fib(n - 1) + fib(n - 2);
}


---

📘 3. Backtracking in Java

✅ What is Backtracking?

Backtracking means:

> Try all possibilities → Undo wrong choices → Try next




---

🔑 Generic Template

void backtrack(List<Integer> path, int[] nums) {
    if (goalReached) {
        result.add(new ArrayList<>(path));
        return;
    }

    for (int choice : nums) {
        // choose
        path.add(choice);

        // explore
        backtrack(path, nums);

        // undo (backtrack)
        path.remove(path.size() - 1);
    }
}


---

📘 4. Example: Subsets

import java.util.*;

public class Main {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    static void backtrack(int start, int[] nums, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);

            backtrack(i + 1, nums, path, result);

            path.remove(path.size() - 1); // undo
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(subsets(nums));
    }
}


---

📘 5. Example: Permutations

import java.util.*;

public class Main {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }

    static void backtrack(int[] nums, List<Integer> path, boolean[] used, List<List<Integer>> result) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            path.add(nums[i]);

            backtrack(nums, path, used, result);

            path.remove(path.size() - 1); // undo
            used[i] = false;
        }
    }
}


---

📘 6. Example: N-Queens (Important)

import java.util.*;

public class Main {
    static List<List<String>> result = new ArrayList<>();

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        backtrack(0, board);
        return result;
    }

    static void backtrack(int row, char[][] board) {
        if (row == board.length) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';

                backtrack(row + 1, board);

                board[row][col] = '.'; // undo
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }
}


---

📘 7. Recursion vs Backtracking

Feature	Recursion	Backtracking

Idea	Function calls itself	Try all possibilities
Undo step	❌ No	✅ Yes (remove)
Usage	Math problems	Combinatorial problems



---

📘 8. Key Pattern to Remember

👉 Always follow this:

// Choose
path.add(...);

// Explore
backtrack(...);

// Undo (IMPORTANT)
path.remove(path.size() - 1);
