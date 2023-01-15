import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Pro_97_1 {
    public static int find(String str,char ch, int n){
        char[] carr = str.toCharArray();
        Arrays.sort(carr);
        int l=0,r=n-1;
        int mid;
        while(l<=r){
            mid = (l+r)/2;
            if(carr[mid]==ch){
                return mid;
            }else if(carr[mid]<ch){
                l=mid+1;
            }else{
                r=mid-1;
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
            System.out.println("character is present in the string");
        }
    }
}
