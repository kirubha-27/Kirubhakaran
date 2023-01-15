import java.util.Arrays;
import java.util.Scanner;

public class Pro_97_2 {

    public static int rec(char[] ch,int l,int r,char key) {

            if (r >= l) {
                int mid = l + (r - l) / 2;
                if (ch[mid] == key)
                    return mid;
                if (ch[mid] > key)
                    return rec(ch, l, mid - 1, key);
                return rec(ch, mid + 1, r, key);
            }
            return -1;
    }

    public static void find(String str, char ch, int n) {
        char[] carr = str.toCharArray();
        Arrays.sort(carr);
        int r=rec(carr,0,n-1,ch);
        if (r <= -1) {
            System.out.println("character is not present in string");
        } else {
            System.out.println("character is present in the string");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        find(str, ch, str.length());

    }
}