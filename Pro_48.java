import java.util.Scanner;


class Pro_48{
    static void pattern(int n){
        for(int i=n;i>=1;i--){
            for(int k=i;k>1;k--){
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            for(int j=n;j>i;j--){
                System.out.print(j-1+" ");
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