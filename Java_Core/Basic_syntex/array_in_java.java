import java.util.Scanner;

    public class array_in_java {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of the array: ");
            int size = sc.nextInt();
            
            int[] numbers = new int[size];
            
            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();

                System.out.println("You have intered: " + numbers[i]);
            }

            sc.close();
        }
}
