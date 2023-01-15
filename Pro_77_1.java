import java.util.*;

public class Pro_77_1 {
    public static int findMax(int[] arr,int n){
        int mx = Integer.MIN_VALUE;
        for(int a:arr){
            mx = Math.max(mx,a);
        }

        return mx;
    }
    public static void sort(int[] arr,int n){
        int max,i = 0,j=0;
        max = findMax(arr,n);
        int[] mem = new int[max+1];
        Arrays.fill(mem,0);
        for(int k=0;k<n;k++){
            mem[arr[k]]++;
        }
        i=0;
        j=0;
        while(i<=max){
            if(mem[i]>0){
                arr[j++]=i;
                mem[i]--;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr = {5,6,3,9,2,7,4};
        sort(arr,arr.length);
    }
}
