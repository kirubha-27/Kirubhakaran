import java.util.Scanner;


class Pro_51{
    static int rev(int n){
        int num = 0;
        int temp = n;
        while(temp!=0){
            num = num*10+(temp%10);
            temp/=10;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= sc.nextInt();
        System.out.println(rev(n));
    }
}