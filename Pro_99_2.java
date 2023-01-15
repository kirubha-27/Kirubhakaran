import java.util.Scanner;

public class Pro_99_2 {
    public static void find(char[] ch,int i,int n){
        if(i>=n){
            return;
        }
        if(ch[i]>='a'&&ch[i]<='z'){
            System.out.print(Character.toUpperCase(ch[i]));
        }else {
            System.out.print(ch[i]);
        }
        find(ch,i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        find(ch,0,ch.length);
    }
}
