public class Pro_8 {

    static String college;
    static class Nclass{
        static void call(){
            System.out.println("from static class "+college);
        }
    }
    static {
        System.out.println("static block called");
        college="avc";
    }
    static void change(){
        college = "AVC college";
    }
    public static void main(String[] args){
        System.out.println("STATIC KEYWORD");
        Pro_8.Nclass.call();
        System.out.println(college);
        change();
        System.out.println(college);
    }
}
