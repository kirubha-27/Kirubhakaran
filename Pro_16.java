import java.util.Scanner;

public class Pro_16 {
    public static void findRoots(double a,double b,double c) {
        double root1, root2;
        double ans1,ans2;
        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {

            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            ans1 = (a*Math.pow(root1,2))+(b*root1)+c;
            ans2 = (a*Math.pow(root2,2))+(b*root2)+c;
            System.out.printf("root1 = %.2f and root2 = %.2f\n", root1, root2);
            System.out.println(ans1+" proved");
            System.out.println(ans2+" proved");
        }
        else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);
            ans1 = (a*Math.pow(root1,2))+(b*root1)+c;
            System.out.printf("root1 = root2 = %.2f;\n", root1);
            System.out.println(ans1+" proved");
        }
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.printf("root1 = %.2f+%.2fi\n", real, imaginary);
            System.out.printf("root2 = %.2f-%.2fi\n", real, imaginary);
            System.out.println("roots are imaginary");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        if(a==0.0){
            System.out.println("invalid input");
            System.exit(0);
        }
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        findRoots(a,b,c);
    }
}
