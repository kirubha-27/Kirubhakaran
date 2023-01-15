import java.util.HashMap;
import java.util.Map;

public class Pro_42_2 {
    public static void print(int[] arr){
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }else{
                freq.put(arr[i],1);
            }
        }


        for(Map.Entry entry:freq.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,3,5,5,3,3,1,6,6,4};
        print(arr);


    }
}
