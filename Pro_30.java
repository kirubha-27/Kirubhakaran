
import java.util.Scanner;


class Pro_30{
    static void largest(int a,int b,int c){

        if( a >= b && a >= c)
            System.out.println(a + " is the largest number.");

        else if (b >= a && b >= c)
            System.out.println(b + " is the largest number.");

        else
            System.out.println(c + " is the largest number.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= sc.nextInt();
        System.out.print("Enter the first number: ");
        int b=sc.nextInt();
        System.out.print("Enter the first number: ");
        int c = sc.nextInt();
        largest(a,b,c);
    }
}