package command;

/**
 * @Author Anjana Shankar
 * @Created 2021-08-01
 */
public class TVRemote {
    Device device;

    public TVRemote() {
        this.device = new Television();
    }

    public Device getDevice() {
        return this.device;
    }
}
