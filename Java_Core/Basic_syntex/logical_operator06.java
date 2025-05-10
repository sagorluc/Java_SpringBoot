public class logical_operator06 {
    public static void main(String[] args) {
        // Logical Operators (&&, ||, !)
        // These operators are used to combine multiple boolean expressions.

        boolean condition1 = true;
        boolean condition2 = false;

        // Logical AND (&&)
        System.out.println("Logical AND: " + (condition1 && condition2)); // false

        // Logical OR (||)
        System.out.println("Logical OR: " + (condition1 || condition2)); // true

        // Logical NOT (!)
        System.out.println("Logical NOT: " + (!condition1)); // false
    }
}
