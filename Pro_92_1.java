import java.util.Arrays;

public class Pro_92_1 {
    public static void rec(String[] st ,int n){
        if(n==1){
           return;
        }
        int count = 0;
        for(int i=0;i<n-1;i++){
            if(st[i].compareTo(st[i+1])>0){
               String temp = st[i];
               st[i]=st[i+1];
               st[i+1]=temp;
               count = count+1;

            }
        }
        if(count==0){
            return;
        }
        rec(st,n-1);

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
