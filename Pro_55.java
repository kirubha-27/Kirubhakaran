
import java.util.Scanner;


class Pro_55{
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if(i==0||i==n-1||j==0)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= sc.nextInt();
        pattern(n);
    }
}