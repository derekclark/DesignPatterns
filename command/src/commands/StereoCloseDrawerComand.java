package commands;

import receivers.Stereo;

public class StereoCloseDrawerComand implements Command{
    Stereo stereo;

    public StereoCloseDrawerComand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.closeDrawer();
    }
}
