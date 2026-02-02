import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1. Create HashMap
        Map<String, Integer> mp = new HashMap<>();

        // 2. Add elements (put)
        mp.put("P", 1);
        mp.put("A", 1);
        mp.put("W", 3);
        mp.put("Y", 4);
        mp.put("D", 5);
        mp.put("X", 6);

        // 3. Get value by key
        System.out.println("Answer: " + mp.get("P"));
        // Output → 1

        // 4. Remove key
        mp.remove("P");

        // 5. Get removed key (returns null)
        System.out.println("After remove: " + mp.get("P"));
        // Output → null

        // 6. Check key existence
        System.out.println("Contains P: " + mp.containsKey("P")); // false
        System.out.println("Contains A: " + mp.containsKey("A")); // true

        // 7. putIfAbsent()
        mp.putIfAbsent("D", 4); // Will NOT update (D already exists)
        mp.putIfAbsent("U", 4); // Will add (U not present)

        // 8. Get only keys
        System.out.println("Keys: " + mp.keySet());

        // 9. Get full key-value pairs
        System.out.println("Entries: " + mp.entrySet());

        // 10. Get only values
        System.out.println("Values: " + mp.values());

        // 11. Loop using keySet()
        System.out.println("First Loop:");
        for (String key : mp.keySet()) {
            System.out.println(key + " = " + mp.get(key));
        }

        // 12. Loop using entrySet() (BEST for interview)
        System.out.println("Second Loop:");
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
