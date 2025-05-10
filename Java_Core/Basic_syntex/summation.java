import java.util.Scanner;

public class summation {
    public static void main(String[] args){
        int result;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = Integer.parseInt(sc1.nextLine());

        System.out.println("Enter sceond number: ");
        int num2 = Integer.parseInt(sc1.nextLine());

        result = num1 + num2;
        System.out.println("Two numbers of sum is: "+ result);
        
        sc1.close();
    }
}
