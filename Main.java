 public class Main {
    public static void main(String[] args) {
       Circle circle = new Circle();
       Rectangle rectangle = new Rectangle();
       Triangle triangle = new Triangle();

        circle.setColor("blue");
        circle.setRadius(2);
        circle.setShape("Circle");
        circle.display();
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());


        rectangle.setWidth(3);
        rectangle.setLength(4);
        rectangle.setColor("red");
        rectangle.setShape("Rectangle");
        rectangle.display();
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());


        triangle.setHeight(6);
        triangle.setBase(5);
        triangle.setShape("Triangle");
        triangle.setColor("orange");
        triangle.display();
        System.out.println(triangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());


    }
}