import java.util.HashMap;
import java.util.Map;

class Pro_44{
    public static void duplicate(int[] arr,int n){
        Map<Integer,Integer> map = new HashMap<>();
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry entry:map.entrySet()){
            int a = (int)entry.getValue();
            if(a>1){
                System.out.print(entry.getKey()+" ");
                flag=false;
            }
        }
        if(flag){
            System.out.println("There is no duplicate in this array");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,6,7,1,4,6};
        duplicate(arr,arr.length);

    }
}