public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    Double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    Double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }

}
