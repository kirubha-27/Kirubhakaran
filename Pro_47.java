import java.util.Scanner;


class Pro_47{
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int k=i;k<n;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i;j>1;j--){
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