import java.util.Scanner;

public class Pro_96_2 {
    public static int find(String str,char ch, int n){
        if (n == 0) {
            return -1;
        }
        else if (str.charAt(n-1) == ch) {
            return n-1;
        }
        else {
            return find(str,ch,n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        int r = find(str,ch,str.length());
        if(r<=-1){
            System.out.println("character is not present in string");
        }else{
            System.out.println("character is present in "+r+"th position");
        }
    }
}
