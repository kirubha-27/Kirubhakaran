import java.util.Scanner;


class Pro_27_1 {
    static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a="+a+" "+"b="+b);
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