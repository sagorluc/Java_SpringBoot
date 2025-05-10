public class arithmatic_operator03 {
    public static void main(String[] args) {
        // Arithmetic Operators (+, -, *, /, %)
        // These operators are used to perform basic mathematical operations.

        int num1 = 10;
        int num2 = 20;
        int result;

        // Addition
        result = num1 + num2;
        System.out.println("Addition: " + result);

        // Subtraction
        result = num1 - num2;
        System.out.println("Subtraction: " + result);

        // Multiplication
        result = num1 * num2;
        System.out.println("Multiplication: " + result);

        // Division 
        result = num2 / num1;
        System.out.println("Division: " + result);

        // Modulus (Finds the remainder)
        // This operator is used to find the remainder of a division operation.
        result = num1 % num2;
        System.out.println("Modulus: " + result); // 10

        result = num2 % num1;
        // This will give the remainder when 20 is divided by 10.
        System.out.println("Modulus: " + result); // 0
    }
}