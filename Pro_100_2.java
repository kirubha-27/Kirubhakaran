import java.io.IOException;


public class Pro_100_2 {
    public static void main(String[] args) {

        try{
            System.out.print("Enter the character (A-Z) only: ");
            int i=System.in.read();
            if(i>='A'&&i<='Z') {
                System.out.println(i);
            }else {
                System.out.println("invalid input");
            }
        }catch (IOException e){
            e.getMessage();
        }

    }
}

