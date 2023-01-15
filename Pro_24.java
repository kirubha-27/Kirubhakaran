import java.util.Scanner;

class Pro_24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Ascii value of "+ch+" is "+(int) ch);
    }
}