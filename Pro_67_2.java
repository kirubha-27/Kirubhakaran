import java.util.HashMap;
import java.util.Map;

public class Pro_67_2 {
    public static void print(int[] a,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else {
                map.put(a[i],1);
            }
        }
        for(Map.Entry entry:map.entrySet()){
            if(map.get(entry.getKey())>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,1,2,3,3,4,4,6,5,5};
        print(a,a.length);

    }
}
