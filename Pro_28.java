import java.util.Scanner;


class Pro_28{
    static boolean check(int a){
        if(a%2==0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a= sc.nextInt();

        if(check(a))
            System.out.println("The given number is even");
        else
            System.out.println("The given number is odd");
    }
}