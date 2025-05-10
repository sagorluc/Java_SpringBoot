
public class data_type02 {
    public static void main(String[] args) {

        byte b1 = 10;
        short s1 = 20;
        int i1 = 30;
        long l1 = 40L;
        float f1 = 50.0f;
        double d1 = 60.0;
        double d2 = 60.5164682;
        char c1 = 'A';
        boolean bool1 = true;
        String str1 = "Hello, World!";
        // Scanner sc1 = new Scanner(System.in);
        // int [] num1 = new int[5];
        // int [] arr = {1, 2, 3, 4, 5};
        cus_print(b1);
        cus_print(s1);
        cus_print(i1);
        cus_print(l1);
        cus_print(f1);
        cus_print(d1);
        cus_print(c1);
        cus_print(bool1);
        cus_print(str1);
        System.out.printf("Formatted value is = %.2f", d2);
    }

    public static void cus_print(Object obj) {
        System.out.println(obj);

    }
}
