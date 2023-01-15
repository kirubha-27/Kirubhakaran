import java.util.Scanner;

class Pro_1{
  public static void multiply(int a){
    for(int i=1;i<=10;i++){
      System.out.printf("%3d%3c%3d = %3d\n",i,'*',a,a*i);
    }
  }
  public static void subtract(int a){
    for(int i=1;i<=10;i++){
      System.out.printf("%3d%3c%3d = %3d\n",a,'-',i,a-i);
    }
  }
  public static void main(String[] args){
    System.out.println("GENERATE MULTIPLICATION AND SUBTRACTION TABLE");
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    int a = sc.nextInt();
    
    System.out.println("Mutiplication table:");
    multiply(a);
     System.out.println("subtraction table:");
    subtract(a);
	
  }
}