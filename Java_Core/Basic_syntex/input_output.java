import java.util.Scanner;

public class input_output {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anythings");
        String str = sc.nextLine();
        System.out.println("You have entered: " + str);
        sc.close();
    }
}
