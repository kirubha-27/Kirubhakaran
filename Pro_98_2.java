import java.util.Scanner;

public class Pro_98_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any small letter in alphabets: ");
        char ch = sc.next().charAt(0);
        if(ch>='a'&&ch<='z')
            System.out.println("The uppercase of "+ch+" is "+Character.toUpperCase(ch));
        else
            System.out.println("invalid input");
    }
}
