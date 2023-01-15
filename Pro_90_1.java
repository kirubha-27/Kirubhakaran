import java.util.Arrays;

public class Pro_90_1 {
    public static void changer(String str){
        String[] st = str.split("\\s");
        String res = "";
        Arrays.sort(st);
        for(int i=0;i<=st.length-1;i++){
            if(i==st.length-1)
                res = res+st[i];
            else
                res = res+st[i]+" ";
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        String str = "hello world program abc bal";
        changer(str);
    }
}
