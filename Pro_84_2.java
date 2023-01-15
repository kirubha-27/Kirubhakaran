public class Pro_84_2 {
    static class Rem{
        static int even=0;
        static int odd=0;
    }
    static int i=0,j=0,even,odd;

    public static Rem rec(int[][] a,int rows,int cols){
        Rem r = new Rem();
        if(i>=rows){
            return r;
        }
        if(j<cols){
            if(a[i][j]%2==0){
                r.even++;
            }else{
                r.odd++;
            }
            j++;
            rec(a,rows,cols);
        }

        j=0;
        i++;

        rec(a,rows,cols);
        return r;
    }
    public static void check(int[][] a,int rows,int cols){

        Rem r=rec(a,rows,cols);
        System.out.println("The frequency of even numbers is "+r.even);
        System.out.println("The frequency of odd numbers is "+r.odd);
    }
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {8, 7, 6, 5},
                {9, 10,12,12},
                {16,15,14,13}};
        check(a,a.length,a[0].length);
    }
}
