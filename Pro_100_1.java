import java.util.Scanner;

public class Pro_100_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character (A-Z) only: ");
        char ch = sc.next().charAt(0);

        System.out.println("The Ascii of "+ch+" is "+(int)ch);

    }
}
