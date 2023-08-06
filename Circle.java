public class Circle extends Shape {
    private int radius;

    Circle(String color, String shape, int radius) {
        super(color, shape);
        this.radius = radius;
    }
}


   public double calculateArea(){
       return 3.14* getRadius() * getRadius();

   }
    public double calculatePerimeter() {
        return 3 * 3.14 * getRadius();
    }
    public void display(){

       System.out.println(getColor());
        System.out.println(getShape());
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

