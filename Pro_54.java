import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Pro_54{
    public static void sort(int[] arr,int n){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i=0;i<n;i++){
            if((i+1)%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even);

        for(int i=0;i<n;i++){
            if(!(odd.isEmpty())){
                arr[i]=odd.get(0);
                odd.remove(0);
            }
            if(!(even.isEmpty())&&i<n-1){
                arr[++i]=even.get(0);
                even.remove(0);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}