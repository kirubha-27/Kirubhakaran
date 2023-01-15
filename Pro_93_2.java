public class Pro_93_2 {
    public static void swap(char[] arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(char[] arr, int low, int high){
        int pivot = arr[high];

        int i = low;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] > pivot) {
                i++;
                swap(arr, i-1, j);
            }
        }
        swap(arr, i, high);
        return i;
    }
    public static void quickSort(char[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static void changer(String str){
        char[] ch = str.toCharArray();

        quickSort(ch,0,ch.length-1);
        StringBuilder strr = new StringBuilder(String.valueOf(ch));
        System.out.println(strr);
    }
    public static void main(String[] args) {
        String str = "program";
        changer(str);
    }
}
