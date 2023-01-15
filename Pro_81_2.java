public class Pro_81_2 {
    static int i=0,j=0;
    static boolean flag = true;
    public static void rec(int[][] a,int[][] b){
        if(i>=a.length){
            return;
        }
        if(j<a[0].length){
            if(a[i][j]!=b[i][j]){
                flag = false;
            }
            j++;
            rec(a,b);
        }
        j=0;
        i++;
        rec(a,b);
    }
    public static void check(int[][] a,int[][] b){
        if(a.length!=b.length||a[0].length!=b[0].length){
            System.out.println("matrices are not equal");
            return;
        }
        rec(a,b);

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
