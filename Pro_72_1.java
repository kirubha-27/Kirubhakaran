import java.util.*;

public class Pro_72_1 {
    public static void remove(int[] a,int n){
        int m=0;

        for (int i=0;i<n;i++) {
            m = Math.max(m,a[i]);
        }
        int[] f = new int[m + 1];

        for (int i=0;i<n;i++) {
            f[a[i]]++;
        }
        for (int i =0;i<m+1;i++) {
            if (f[i] >=1) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,3,4,4,6,5,5};
        remove(a,a.length);

    }
}
