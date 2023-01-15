public class Pro_70_1 {
    public static void large(int[] a,int n){
        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<a[i]){
                s_max = max;
                max = a[i];
            }
            if(a[i]>s_max&&a[i]<max){
                s_max = a[i];
            }
        }
        System.out.println("The second largest element is "+s_max);
    }
    public static void main(String[] args) {
        int[] a = {9,34,1,2,4,5,7,3,6};
        large(a,a.length);
    }
}
