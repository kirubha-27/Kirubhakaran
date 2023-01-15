import java.util.Scanner;

class Pro_59_3{
    public static int print(String s1,String s2){

	  //indexof method

        int n  = s1.indexOf(s2);
        return n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the String 2: ");
        String s2  = sc.nextLine();
        System.out.println();
        System.out.println(print(s1,s2));


    }
}