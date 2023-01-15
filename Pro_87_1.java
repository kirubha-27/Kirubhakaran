public class Pro_87_1 {
    public static void change(char[] ch){
        String str = "";
        for(int i=0;i<ch.length;i++){
            str+=ch[i];
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        char[] ch = {'a','b','c','d'};
        change(ch);
    }
}
