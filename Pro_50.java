import java.util.Scanner;


class Pro_50{
    static void pattern(int n){
        int m=n;
        for(int i=0;i<n;i++){
            for(int k=i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print(m+" ");

            }
            m--;
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