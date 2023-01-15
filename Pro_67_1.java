public class Pro_67_1 {
    public static void print(int[] a,int n){
        int m=0;

        for (int i=0;i<n;i++) {
            m = Math.max(m,a[i]);
        }
        int[] f = new int[m + 1];

        for (int i=0;i<n;i++) {
            f[a[i]]++;
        }
        for (int i =0;i<m+1;i++) {
            if (f[i] > 1) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4};
        print(arr,arr.length);
    }
}
