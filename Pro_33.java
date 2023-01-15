import java.util.Scanner;

class Pro_33{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char c = sc.next().charAt(0);

        String str =(c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z') 
		? c + " is an alphabet":c+ " is not an alphabet";

        System.out.println(str);
    }
}