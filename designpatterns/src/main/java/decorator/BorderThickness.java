package decorator;

/**
 * @Author Anjana Shankar
 * @Created 2021-01-27
 */
public class BorderThickness extends ShapeDecorator {
    Integer borderThickness;

    public BorderThickness(Shape decoratedShape, Integer thickness) {
        super(decoratedShape);
        this.borderThickness = thickness;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setThickness();
    }

    private void setThickness(){
        System.out.println("Border Width: "+borderThickness);
    }
}
