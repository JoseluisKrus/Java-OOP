public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(16.00,12.00);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Circle circle = new Circle(7.00);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

    }
}
