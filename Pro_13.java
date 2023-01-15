class Square{
    private final int side;
    Square(int s){
        side=s;
    }
    public int area(){
        return side*side;
    }
}

class Pro_13{
    public static void main(String[] args) {
        Square square = new Square(4);
        System.out.println("Area of Square is "+square.area());
    }
}