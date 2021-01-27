package decorator;

/**
 * @Author Anjana Shankar
 * @Created 2021-01-04
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("This is a circle !!!");
    }
}
