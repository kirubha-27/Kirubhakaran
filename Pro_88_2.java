import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pro_88_2 {
    public static String[] convert(Set<String> set){

        String[] str = new String[set.size()];
        int i=0;
        for(String s:set){
            str[i++]=s;
        }
        return str;
    }
    public static void main(String[] args) {
        String str = "I Love India";
        Set<String> set = new HashSet<>(Arrays.asList(str));
        String[] str_arr = convert(set);
        System.out.println(Arrays.toString(str_arr));
    }
}
