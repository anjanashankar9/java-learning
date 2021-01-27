package decorator;

/**
 * @Author Anjana Shankar
 * @Created 2021-01-27
 */
public class FillColor extends ShapeDecorator {
    String color;

    public FillColor(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setColor();
    }

    private void setColor(){
        System.out.println("Color: "+color);
    }
}
