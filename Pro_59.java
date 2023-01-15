
import java.util.Scanner;

class Pro_59{
    public static int print(String s1,String s2){

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(0)){

                if(s2.length()+i<=s1.length()) {
                    String temp = s1.substring(i, s2.length() + i);
                    if (s2.equals(temp)) {
                        return i;
                    }
                }
            }
        }
        return -1;


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