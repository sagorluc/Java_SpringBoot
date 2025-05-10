public class assignment_operator04 {
    public static void main(String[] args) {
        // Assignment Operators (=, +=, -=, *=, /=, %=)
        // These operators are used to assign values to variables.

        int num1 = 10;
        int num2 = 20;

        // Simple assignment
        num1 = num2;
        System.out.println("Simple assignment: " + num1); // 20

        // Add and assign               10  = 10 + 20
        num1 += num2; // Equivalent to num1 = num1 + num2
        System.out.println("Add and assign: " + num1); // 40

        // Subtract and assign
        num1 -= num2; // Equivalent to num1 = num1 - num2
        System.out.println("Subtract and assign: " + num1); // 20

        // Multiply and assign
        num1 *= num2; // Equivalent to num1 = num1 * num2
        System.out.println("Multiply and assign: " + num1); // 400

        // Divide and assign
        num1 /= num2; // Equivalent to num1 = num1 / num2
        System.out.println("Divide and assign: " + num1); // 20

        // Modulus and assign
        num1 %= 3; // Equivalent to num1 = num1 % 3
        System.out.println("Modulus and assign: " + num1); // 2

    }
}
