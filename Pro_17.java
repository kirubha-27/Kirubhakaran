class ConcreteCircle{
    private final int r1;
    private final int r2;
    ConcreteCircle(int x,int y){
        r1=x;
        r2=y;
    }
    public double area(){
        double ar1 = Math.PI*Math.pow(r1,2);
        double ar2 = Math.PI*Math.pow(r2,2);
        return ar1-ar2;
    }

}
class Pro_17{

    public static void main(String[] args) {
        ConcreteCircle concreteCircle = new ConcreteCircle(6,3);
        System.out.printf("Area of concretecircle is %.3f",concreteCircle.area());
    }
}