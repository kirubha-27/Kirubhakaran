import java.util.Scanner;

public class Pro_99_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                System.out.print((char)(str.charAt(i)-32));
            }else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
