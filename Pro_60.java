import java.util.Scanner;

class Pro_60{
    public static void generate(int n){
        int c=1,sum=0;
        for(int i=0;i<n;i++){
            System.out.print(c+" ");
            if(i<n-1){
                System.out.print("+ ");
            }
            sum = sum+c;
            c=c*10+1;

        }
        System.out.println();
        System.out.println("The Sum is: "+sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        generate(n);
    }
}