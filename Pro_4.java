import java.sql.SQLOutput;
import java.util.Scanner;

class Pro_4{
    public static void main(String[] args) {
        System.out.println("BITWISE OPERATORS");
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Enter the bitwise operator: ");
        String c = sc.nextLine();

        switch (c){
            case "&":
                System.out.print("Enter the binary numbers a and b: ");
                a = sc.nextInt(2);
                b = sc.nextInt(2);
                System.out.printf("%3s%3c%3s=%3s",Integer.toBinaryString(a),'&',Integer.toBinaryString(b),Integer.toBinaryString(a&b));
                break;
            case "|":
                System.out.print("Enter the binary numbers a and b: ");
                a = sc.nextInt(2);
                b = sc.nextInt(2);
                System.out.printf("%3s%3c%3s=%3s",Integer.toBinaryString(a),'|',Integer.toBinaryString(b),Integer.toBinaryString(a|b));
                break;
            case "^":
                System.out.print("Enter the binary numbers a and b: ");
                a = sc.nextInt(2);
                b = sc.nextInt(2);
                System.out.printf("%3s%3c%3s=%3s",Integer.toBinaryString(a),'^',Integer.toBinaryString(b),Integer.toBinaryString(a^b));
                break;
            case "~":
                System.out.println("Enter the binary number a: ");
                a = sc.nextInt(2);

                System.out.printf("%3s",Integer.toBinaryString(~a));
                break;
            case "<<":
                System.out.println("Enter the binary number a: ");
                a=sc.nextInt(2);
                System.out.printf("%3s",Integer.toBinaryString(a<<2));
                break;
            case ">>":
                System.out.println("Enter the decimal number a: ");
                a=sc.nextInt();
                System.out.printf("%3s",Integer.toBinaryString(a>>2));
                break;
            case ">>>":
                System.out.println("Enter the decimal number a: ");
                a=sc.nextInt();
                System.out.printf("%3s",Integer.toBinaryString(a>>>2));
                break;
        }

    }
}