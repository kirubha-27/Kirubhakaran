import java.util.Scanner;


class Pro_27_2{
    static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        swap(a,b);
    }
}
