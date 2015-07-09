package commands;

/**
 * Created by work on 28/02/15.
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }
    @Override
    public void execute() {
        for (int i=0; i<2; i++){
            commands[i].execute();
        }
    }
}
