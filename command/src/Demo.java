import commands.*;
import invoker.SimpleRemoteControl;
import invoker.MultiButtonRemoteControl;
import receivers.GarageDoor;
import receivers.Light;
import receivers.Stereo;

public class Demo {
    static MultiButtonRemoteControl multiButtonRemoteControl;
    static LightOnCommand lightOnCommand;
    static LightOffCommand lightOffCommand;
    static StereoOpenDrawerCommand stereoOpenDrawerCommand;
    static StereoCloseDrawerComand stereoCloseDrawerComand;
    static MacroCommand macroOnCommands;
    static MacroCommand macroOffCommands;

    public static void main(String args[]){
        demoSimpleOneButtonRemoteControl();
        demoMultiButtonRemoteControl();
    }

    public static void demoMultiButtonRemoteControl(){
        createInvoker();
        createCommands();
        assignCommandsToButtons();
        showCommandsOnMultiButtonRemoteControl(multiButtonRemoteControl);
        pushButtons(multiButtonRemoteControl);
    }

    private static void assignCommandsToButtons() {
        multiButtonRemoteControl.setCommand(0,lightOnCommand, lightOffCommand);
        multiButtonRemoteControl.setCommand(1,stereoOpenDrawerCommand, stereoCloseDrawerComand);
        multiButtonRemoteControl.setCommand(2, macroOnCommands, macroOffCommands);
    }

    private static void createInvoker() {
        multiButtonRemoteControl = new MultiButtonRemoteControl();
    }

    private static void createCommands() {
        lightOnCommand = new LightOnCommand(new Light());
        lightOffCommand = new LightOffCommand(new Light());
        stereoOpenDrawerCommand = new StereoOpenDrawerCommand(new Stereo());
        stereoCloseDrawerComand = new StereoCloseDrawerComand(new Stereo());

        //this one is creating a button which executes multiple commands
        Command[] onCommands = { lightOnCommand, stereoOpenDrawerCommand };
        Command[] offCommands = { lightOffCommand, stereoCloseDrawerComand };
        macroOnCommands = new MacroCommand(onCommands);
        macroOffCommands = new MacroCommand(offCommands);
    }

    private static void showCommandsOnMultiButtonRemoteControl(MultiButtonRemoteControl multiButtonRemoteControl) {
        System.out.println(multiButtonRemoteControl.toString());
    }

    private static void pushButtons(MultiButtonRemoteControl multiButtonRemoteControl) {
        for (int i= 0; i<3; i++){
            System.out.println("pressing on button " + i);
            multiButtonRemoteControl.onButtonWasPressed(i);
            System.out.println("pressing off button " + i);
            multiButtonRemoteControl.offButtonWasPressed(i);
        }
    }

    private static void demoSimpleOneButtonRemoteControl() {
        //create the remote control which can hold one command in its slot - the invoker
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        //create 2 command objects
        LightOnCommand lightOnCommand = new LightOnCommand(new Light());
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());

        //set the remote control button to be the light on command and execute it
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();

        //set the remote control button to be the garage door open command and execute it
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();
    }

}
