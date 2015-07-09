package commands;

import receivers.Stereo;

/**
 * Created by work on 28/02/15.
 */
public class StereoOpenDrawerCommand implements Command {
    Stereo stereo;

    public StereoOpenDrawerCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.openDrawer();
    }
}
