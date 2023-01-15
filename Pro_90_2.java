import java.util.*;

public class Pro_90_2 {

    public static void changer(String str){
        String[] st = str.split("\\s");
        List<String> list = new ArrayList<>(List.of(st));
        String res = "";
        Collections.sort(list);

        System.out.println(list.toString());
    }
    public static void main(String[] args) {
        String str = "hello world program abc bal";
        changer(str);
    }
}
