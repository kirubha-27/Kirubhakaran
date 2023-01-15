public class Pro_71_1 {
    public static void small(int[] a,int n){
        int min = Integer.MAX_VALUE;
        int s_min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<min){
                s_min = min;
                min = a[i];
            }
            if(a[i]<s_min&&a[i]>min){
                s_min = a[i];
            }
        }
        System.out.println("The second smallest element is "+s_min);
    }
    public static void main(String[] args) {
        int[] a = {7,5,7,2,8,4,5,67,3};
        small(a,a.length);
    }
}
