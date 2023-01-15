import java.util.Scanner;

class Pro_34{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        while(sum!=0){
            if(sum%10>max){
                max=sum%10;
            }
            sum/=10;
        }
        System.out.println("Largest digit of sum = "+max);
    }
}