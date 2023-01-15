import java.util.Scanner;

public class Pro_98_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any small letter in alphabets: ");
        char ch = sc.next().charAt(0);
        if(ch>='a'&&ch<='z')
            System.out.println("The uppercase of 'a' is "+(char)(ch-32));
        else
            System.out.println("invalid input");
    }
}
