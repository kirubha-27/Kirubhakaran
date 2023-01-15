import java.util.Arrays;

public class Pro_92_2 {
    public static void rec(String[] str ,int n){



            if (n <= 1)
                return;


            rec( str, n-1 );

            String last = str[n-1];
            int j = n-2;

            while (j >= 0 && str[j].compareTo(last)>0)
            {
                str[j+1] = str[j];
                j--;
            }
            str[j+1] = last;

    }
    public static void changer(String str){
        String[] st = str.split("\\s");
        rec(st,st.length);
        System.out.println(Arrays.toString(st));
    }
    public static void main(String[] args) {
        String str = "hello world program arm bo";
        changer(str);
    }
}
