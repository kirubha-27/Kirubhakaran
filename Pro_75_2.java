public class Pro_75_2 {
    public static void print(int[] a,int i,int n){
        if(i>=n){
            return;
        }
        System.out.print(a[i]+" ");
        print(a,i+2,n);
    }
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6};
        System.out.print("Even elements: ");
        print(a,0,a.length);
        System.out.println();
        System.out.print("odd elements: ");
        print(a,1,a.length);
    }
}
