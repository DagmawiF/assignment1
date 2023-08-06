public abstract class Shape {
    private String color;

    private String shape;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void   display(){

        System.out.println(getColor());
    }


    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
