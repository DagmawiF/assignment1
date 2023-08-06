public class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String color, String shape, double length, double width) {
        super(color, shape);
        this.length = length;
        this.width = width;
    }
}


public double calculateArea(){
    return getwidth() * getlength();

}
public double calculatePerimeter(){
    return 2 * getlength() + getwidth();
}

public void display(){
    system.out.printIn(getColor());
    system.out.printIn(getShape());
}
public double getlength() {
    return length;
}