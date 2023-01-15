public class Pro_81_1 {
    public static void check(int[][] a,int[][] b){
        boolean flag = true;
        if(a.length!=b.length||a[0].length!=b[0].length){
            System.out.println("matrices are not equal");
            return;
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if(a[i][j] != b[i][j]){
                    flag = false;
                    break;
                }
            }
        }

        if(flag)
            System.out.println("Matrices are equal");
        else
            System.out.println("Matrices are not equal");
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {8, 7, 6, 5},
                {9, 10,11,12},
                {16,15,14,13}};
        int[][] b = {
                {1,2,3,4},
                {8,7,6,5},
                {9,10,11,12},
                {16,15,14,13}};
        check(a,b);
    }
}
