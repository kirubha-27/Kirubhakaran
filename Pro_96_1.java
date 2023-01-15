import java.util.Scanner;

public class Pro_96_1 {
    public static int find(String str,char ch, int n){
        for(int i=0;i<n;i++){
            if(str.charAt(i)==ch){
               return i;
            }
        }
        return -1;
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
