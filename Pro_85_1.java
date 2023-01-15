public class Pro_85_1 {
    public static void check(int[][] a,int rows,int cols){
        for(int i=0;i<rows;i++){
            int sumr=0;
            for(int j=0;j<cols;j++){
                sumr+=a[i][j];
            }
            System.out.printf("sum of row%d is %d\n",i+1,sumr);
        }
        for(int i=0;i<cols;i++){
            int sumc=0;
            for(int j=0;j<rows;j++){
                sumc+=a[j][i];
            }
            System.out.printf("sum of col%d is %d\n",i+1,sumc);
        }
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
