interface Drawable {
    void draw();
}

interface Resizable {
    void resize(double factor);
}

class Circle implements Drawable, Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Circle resized to new radius: " + radius);
    }
}

class Rectangle implements Drawable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.draw();
        circle.resize(1.5);

        System.out.println();

        Rectangle rectangle = new Rectangle(4.0, 3.0);
        rectangle.draw();
    }
}
//20
