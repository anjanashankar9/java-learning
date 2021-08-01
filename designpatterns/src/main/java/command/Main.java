package command;

import decorator.*;

/**
 * @Author Anjana Shankar
 * @Created 2021-08-01
 */
public class Main {

    public static void main(String[] args) {
        TVRemote tvRemote = new TVRemote();

        Device device = tvRemote.getDevice();

        // Turn TV on
        Command cmd = new TurnTVOn(device);
        cmd.execute();

        //Turn TV Off
        cmd = new TurnTVOff(device);
        cmd.execute();

    }
}
