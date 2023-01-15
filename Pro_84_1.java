public class Pro_84_1 {
    public static void check(int[][] a,int rows,int cols){
        int even=0,odd=0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(a[i][j]%2==0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println("The frequency of even numbers is "+even);
        System.out.println("The frequency of odd numbers is "+odd);
    }
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {8, 7, 6, 5},
                {9, 10,11,12},
                {16,15,14,13}};
        check(a,a.length,a[0].length);
    }
}