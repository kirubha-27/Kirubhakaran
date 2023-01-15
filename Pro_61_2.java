public class Pro_61_2 {
    public static void print(int[] a){
        int i=a.length-1;
        while (i>=0){
            System.out.print(a[i]+" ");
            i--;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        print(a);
    }
}
