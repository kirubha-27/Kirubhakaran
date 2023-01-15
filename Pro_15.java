class Cylinder{
    private final int diameter;
    private final int height;

    Cylinder(int d,int h){
        diameter=d;
        height = h;
    }
    public double area(){
        return (2*Math.PI*Math.pow(diameter/2,2))+(2*Math.PI*(diameter/2)*height);
    }
}

class Pro_15{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,9);
        System.out.printf("Area of cylider is %.3f",cylinder.area());
    }
}