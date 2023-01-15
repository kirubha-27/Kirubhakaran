public class Pro_63_2 {
    static class Pair{
        int min;
        int max;
    }
    public static Pair print(int[] arr,int low,int high){
        Pair pair = new Pair();
        Pair pairL = new Pair();
        Pair pairR = new Pair();

        if(low==high){
            pair.max=arr[low];
            pair.min=arr[high];
            return pair;
        }
        if(high==low+1){
            if(arr[low]>arr[high]){
                pair.max = arr[low];
                pair.min = arr[high];
            }else {
                pair.max = arr[high];
                pair.min = arr[low];
            }
            return pair;
        }
        int mid = (low+high)/2;
        pairL = print(arr,0,mid);
        pairR = print(arr,mid+1,high);

        if(pairL.min>pairR.min){

            pair.min = pairR.min;
        }else{
            pair.min = pairL.min;
        }
        if(pairL.max>pairR.max){

            pair.max = pairL.max;
        }else{
            pair.max = pairR.max;
        }
        return pair;
    }
    public static void main(String[] args) {
        int[] arr = {1,22,3,4,56,44,56};
        Pair p = print(arr,0,arr.length-1);

        System.out.println("The largest element is "+p.max);
        System.out.println("The smallest element is "+p.min);
    }
}