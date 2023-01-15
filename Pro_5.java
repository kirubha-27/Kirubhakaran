import java.util.Scanner;

class Pro_5{

    public static void main(String[] args) {
        System.out.println("PATTERN PRINTING");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        Character c = sc.next().charAt(0);
        c=c.toString().toUpperCase().charAt(0);
        for(char i = c;i>='A';i--){
            for(char j=i;j>='A';j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}