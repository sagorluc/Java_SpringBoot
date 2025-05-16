public class Myfirstspringboot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a, b, sum, sub, mul, div;
//        a = 20;
//        b = 40;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a operator sign: ");
        String ope = sc.nextLine();
        System.out.println("Enter a scoend number: ");
        int num2 = sc.nextInt(); // Integer
        
        if(ope == "+"){
            
            sum = num1 + num2;
            System.out.println("Sum is: " + sum);
        }
        else if(ope == "-"){
        sub = num2 - num1;
        System.out.println("Sub is: " + sub);
        }
        else if(ope == "*"){
        mul = num1 * num2;
        System.out.println("Multipliction is: " + mul);
        }
        else{
        div = num2 / num1;
        System.out.println("Divition is: " + div);
        }
    }
    
}
