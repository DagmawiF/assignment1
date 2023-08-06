public class Triangle extends Shape {
    private double base;
    private double height;
    Triangle(String color, String shape, double base, double height) {
         super(color, shape)
         this.base = base;
         this.height = height;
    }
}

    public double calculateArea(){
        return getHeight() * getBase() / 2;
    }
    public double calculatePerimeter() {
        return getHeight() * 3;
    }
    public void display(){

        System.out.println(getColor());
        System.out.println(getShape());
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {

        
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
