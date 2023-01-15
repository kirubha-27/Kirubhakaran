import java.util.Scanner;

class Pro_25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        int quotient = dividend/divisor;
        int reminder = dividend%divisor;
        System.out.println("quotient is "+quotient);
        System.out.println("reminder is "+reminder);

    }
}