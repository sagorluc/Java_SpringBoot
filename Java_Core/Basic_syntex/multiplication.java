import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        int mul;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a scoend number: ");
        int num2 = sc.nextInt(); // Integer

        mul = num1 * num2;
        System.out.println("Multiplication is: " + mul);

        sc.close();
    }
}
