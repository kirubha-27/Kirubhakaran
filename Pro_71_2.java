import java.util.Arrays;
import java.util.Collections;

public class Pro_71_2 {
    public static void small(int[] a,int n){
        Arrays.sort(a);
        System.out.println("The second smallest element is "+a[1]);
    }
    public static void main(String[] args) {
        int[] a = {7,5,7,2,8,4,5,67,3};
        small(a,a.length);
    }
}
