public class Pro_75_1 {
    public static void print(int[] a,int n){
        System.out.println("Elements in even position: ");
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Elements in odd position: ");
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6};
        print(a,a.length);
    }
}
