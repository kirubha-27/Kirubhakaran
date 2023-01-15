import java.util.Scanner;
class Pro_3{
	public static void main(String[] args){
		System.out.println("DIFFERENCE BETWEEN GIVEN NUMBER AND IT'S REVERSE NUMBER ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		int rev = 0;
		int temp = a;
		int diff=0;
		while(temp!=0){
			rev = (rev*10)+(temp%10);
			temp /=10;
		}
		diff = a-rev;
		System.out.println(diff);
	}
}
		