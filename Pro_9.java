
import java.sql.SQLOutput;
import java.util.*;

class Pro_9{
    public static void merge(int[] arr1,int n,int[] arr2,int m){
        List<Integer> list = new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                list.add(arr1[i++]);
            } else if (arr2[j]<arr1[i]) {
                list.add(arr2[j++]);
            }else{
                list.add(arr1[i++]);
                j++;
            }
        }
        while(j<arr2.length){
            list.add(arr2[j++]);
        }
        while(i<arr1.length){
            list.add(arr1[i++]);
        }
        System.out.println(Arrays.toString(list.toArray()));

    }
    public static void main(String[] args) {
        System.out.println("NON REPEATED ELEMENT FROM SORTED ARRAY");
        int[] arr1 = new int[]{2,4,5,6,7,9,10,13};
        int[] arr2 = new int[]{2,3,4,5,6,7,8,9,11,15};
        int n=arr1.length;
        int m=arr2.length;
        merge(arr1,n,arr2,m);
    }
}