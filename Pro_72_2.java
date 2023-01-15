import java.util.HashMap;

public class Pro_72_2 {
    public static void remove(int[] a,int n){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.get(a[i])==null){
                System.out.print(a[i]+" ");
                map.put((a[i]),true);
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,3,4,4,6,5,5};
        remove(a,a.length);

    }
}
