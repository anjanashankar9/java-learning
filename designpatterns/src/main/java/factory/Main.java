package factory;

/**
 * @Author Anjana Shankar
 * @Created 2021-01-04
 */
public class Main {

    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape c = sf.getShape("Circle");
        assert c.draw().contains("circle");

        Shape r = sf.getShape("Rectangle");
        assert r.draw().contains("rectangle");

        Shape s = sf.getShape("Square");
        assert s.draw().contains("square");
    }
}
