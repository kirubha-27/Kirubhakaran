import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pro_65_2 {
    public static void freq(int[] arr,int n) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            } else {
                freqMap.put(arr[i], 1);
            }
        }
        for (Map.Entry entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,4,6,4,3,2,1};
        freq(arr,arr.length);
    }
}
