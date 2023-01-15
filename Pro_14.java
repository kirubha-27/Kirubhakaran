class Rectangle{
    private final int length;
    private final int breadth;
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public int area(){
        return length*breadth;
    }
}

class Pro_14{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("Area of rectangle is "+rectangle.area());
    }
}