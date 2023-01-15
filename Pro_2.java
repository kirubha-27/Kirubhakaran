import java.util.Scanner;
class Pro_2{
  public static void main(String[] args){
      System.out.println("FOR PRINT FROM INPUT TO 'Z' ");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the character: ");
    char a = sc.next().charAt(0);
    if((!(a>='A'&&a<='Z')&&(a>='a'&&a<='z'))) {
        a = (char) (a - 32);
    }else if((a<'A'||a>'Z')){
        System.out.println("Wrong Input!!!");
        System.exit(0);
    }
    for(char c=a;c<='Z';c++){
	System.out.print(c);
    }
  }
}