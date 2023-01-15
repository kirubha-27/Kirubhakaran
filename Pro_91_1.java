import java.util.Arrays;
import java.util.Collections;

public class Pro_91_1 {
    public static void sort(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(ch));
        sb.reverse();
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String str = "program";
        sort(str);
    }
}
