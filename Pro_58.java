import java.util.Scanner;


class Pro_58{
    static void pattern(int n){
        int i,j;
        for(i=1; i<n; i++) {
            for(j=i; j<=n; j++) {
                System.out.print("*");
            }
            for(j=1; j<=(2*i-2); j++) {
                System.out.print("_");
            }
            for(j=i; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1; i<=n; i++) {
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(j=(2*i-2); j<(2*n-2); j++) {
                System.out.print("_");
            }
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        pattern(n);
    }
}