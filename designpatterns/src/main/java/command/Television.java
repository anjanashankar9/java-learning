package command;

/**
 * @Author Anjana Shankar
 * @Created 2021-08-01
 */
public class Television implements Device {
    @Override
    public void on() {
        System.out.println("TV is on !!");
    }

    @Override
    public void off() {
        System.out.println("TV is off !!");

    }
}
