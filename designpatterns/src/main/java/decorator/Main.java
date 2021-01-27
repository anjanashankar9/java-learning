package decorator;

import factory.ShapeFactory;

/**
 * @Author Anjana Shankar
 * @Created 2021-01-04
 */
public class Main {

    public static void main(String[] args) {
        Shape c = new Circle();
        Shape redCircle = new FillColor(c, "Red");

        redCircle.draw();

        Shape r = new Rectangle();
        Shape thickRectangle = new BorderThickness(r, 2);
        thickRectangle.draw();

    }
}
