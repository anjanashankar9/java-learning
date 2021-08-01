package command;

/**
 * @Author Anjana Shankar
 * @Created 2021-08-01
 */
public class TurnTVOff implements Command {

    Device device;

    public TurnTVOff(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }
}
