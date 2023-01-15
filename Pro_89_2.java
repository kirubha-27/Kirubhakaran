import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Pro_89_2 {
    public static void create(String str){
        Pattern pattern = Pattern.compile("\\s");

        String[] str_arr = pattern.split(str);

        System.out.println(Arrays.toString(str_arr));

    }
    public static void main(String[] args) {
        String str = "I Love India";
        create(str);
    }
}
