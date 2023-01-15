public class Pro_87_4 {
    public static void change(char[] ch){
        StringBuilder str = new StringBuilder();
        str.insert(0,ch,0,ch.length);
    }
    public static void main(String[] args) {
        char[] ch = {'a','b','c','d'};
        change(ch);
    }
}
