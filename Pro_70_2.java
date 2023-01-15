import java.util.Arrays;

public class Pro_70_2 {
    public static void large(int[] a,int n){
        Arrays.sort(a);
        System.out.println("The second largest element is "+a[n-2]);
    }
    public static void main(String[] args) {
        int[] a = {9,34,1,2,4,5,7,3,6};
        large(a,a.length);
    }
}
