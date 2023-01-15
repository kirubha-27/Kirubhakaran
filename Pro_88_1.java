import java.util.Arrays;
import java.util.StringTokenizer;

public class Pro_88_1 {
    public static void create(String str){
        String[] st = str.split("\\s");

        System.out.println(Arrays.toString(st));

    }
    public static void main(String[] args) {
        String str = "I Love India";
        create(str);
    }
}
