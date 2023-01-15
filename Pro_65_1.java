import java.util.Arrays;

public class Pro_65_1 {
    public static void freq(int[] arr,int n){
        boolean[] bool = new boolean[n];
        Arrays.fill(bool,false);
        int count;
        for(int i=0;i<n;i++){
            count = 1;
            if(bool[i]==true){
                continue;
            }
            for(int j=i+1;j<n;j++){

                if(arr[i]==arr[j]){
                    bool[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i]+" "+count);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,4,6,4,3,2,1};
        freq(arr,arr.length);
    }
}
