public class RectangleShape {
    double width, height;

    public RectangleShape() {

    }

    public RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + this.width + ", height=" + this.height + "}";
    }
}
