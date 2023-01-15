public class Pro_62_1 {
    public static void print(int[] a){
        System.out.print("Elements in odd position: ");
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                System.out.print(a[i]+" ");
            }
        }

        System.out.printf("\nElements in even position: ");
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                System.out.print(a[i]+" ");
            }
        }

    }
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6};
        print(a);
    }
}
