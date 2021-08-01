package command;

/**
 * @Author Anjana Shankar
 * @Created 2021-08-01
 */
public class Remote {
    Device device;

    public Remote() {
        this.device = new Television();
    }

    public Device getDevice() {
        return this.device;
    }
}
