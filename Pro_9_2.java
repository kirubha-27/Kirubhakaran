import java.util.*;

class Pro_9_2{
    public static void merge(int[] arr1,int n,int[] arr2,int m){
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<m;j++){
            set.add(arr2[j]);
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
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