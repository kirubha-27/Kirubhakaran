import java.util.Arrays;
import java.util.StringTokenizer;

public class Pro_89_1 {
    public static void create(String str){
        int i=0;

        StringTokenizer st = new StringTokenizer(str);
        String[] strArr = new String[st.countTokens()];
        while (st.hasMoreTokens()){
            strArr[i++] = st.nextToken();
        }

        System.out.println(Arrays.toString(strArr));

    }
    public static void main(String[] args) {
        String str = "I Love India";
        create(str);
    }
}
