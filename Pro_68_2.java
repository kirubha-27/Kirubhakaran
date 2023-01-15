public class Pro_68_2 {
    public static void find(int[] a,int sum,int i,int n){
        if(i>=n){
            System.out.println("The sum of array element is "+sum);
            return;
        }
        find(a,sum+a[i],i+1,n);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,2};

        find(a,0,0,a.length);

    }
}
