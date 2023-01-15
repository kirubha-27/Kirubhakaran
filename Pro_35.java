import java.util.Scanner;
class Pro_35{

    public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        long factorial = 1;
        long temp,sum=0;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.println("Factorial of Number = "+factorial);
        temp = factorial;
        while (temp!=0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("Sum of Factorial = "+sum);
    }
}