package command;

/**
 * @Author Anjana Shankar
 * @Created 2021-08-01
 */
public class TurnTVOn implements Command {

    Device device;

    public TurnTVOn(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }
}
