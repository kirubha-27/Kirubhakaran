
import java.util.Scanner;


class Pro_29{
    static boolean check(char ch){
        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
                    ||ch=='A'||ch=='E'||ch=='I'
                    ||ch=='O'||ch=='U'){
                return true;
            }else {
                return false;
            }
        }else {
            System.out.println("Enter correct value");
            System.exit(0);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the only alphabets: ");
        char a= sc.next().charAt(0);

        if(check(a))
            System.out.println("The given number is vowels");
        else
            System.out.println("The given number is consonant");
    }
}