<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=28&duration=2000&pause=800&color=00F7FF&center=true&vCenter=true&width=700&height=70&lines=Hi+I'm+Pawan+%F0%9F%91%8B;Java+%7C+DSA+Practitioner;Clean+Code+%7C+Daily+Push" alt="banner"/>
</p>

---

## 👋 About
- 🎓 Engineering student focused on **Java & DSA**  
- 💻 I push small, clean Java solutions to my repos daily  
- ✉️ your-email@example.com

---

## 🛠 Skills (Beginner friendly)
<div align="center">
  ![Java](https://img.shields.io/badge/Java-%23ED8B00?style=for-the-badge&logo=java&logoColor=white)
  ![OOP](https://img.shields.io/badge/OOP-%23007ACC?style=for-the-badge)
  ![DSA](https://img.shields.io/badge/DSA-%23A435F0?style=for-the-badge)
  ![Git](https://img.shields.io/badge/Git-%23F05032?style=for-the-badge&logo=git&logoColor=white)
</div>

---

## 📁 Featured (Simple)
- **Java-DSA** — Daily DSA practice in Java (arrays, stacks, linked lists)  
- **Java-Programs** — Small programs & examples I use while learning

*(Create these repos if not present; link them by replacing `YOUR_USERNAME` below.)*

[My Java-DSA](https://github.com/YOUR_USERNAME/Java-DSA) • [My Java-Programs](https://github.com/YOUR_USERNAME/Java-Programs)

---

## 🧠 Quick Code Snippet (clean & short)
```java
// Reverse string using stack - simple & clear
import java.util.Stack;

public class ReverseString {
    public static String reverse(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) st.push(c);
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("Pawan")); // Output: nawaP
    }
}
